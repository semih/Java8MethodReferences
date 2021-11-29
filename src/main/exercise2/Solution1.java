package main.exercise2;

import main.exercise2.dao.CityDao;
import main.exercise2.dao.CountryDao;
import main.exercise2.dao.InMemoryWorldDao;
import main.exercise2.domain.City;
import main.exercise2.domain.Country;

import java.util.Comparator;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class Solution1 {

    private static final CountryDao countryDao = InMemoryWorldDao.getInstance();
    private static final CityDao cityDao = InMemoryWorldDao.getInstance();

    // Q.1) Find the highest populated capital city
    public static void main(String[] args) {

        Optional<City> city = countryDao.findAllCountries()
                .stream()
                .map(Country::getCapital)
                .map(cityDao::findCityById)
                .filter(Objects::nonNull)
                .collect(Collectors.maxBy(Comparator.comparing(City::getPopulation)));
        city.ifPresent(System.out::println);

/*        List<City> cityList = countryDao.findAllCountries()
                .stream()
                .map(Country::getCapital)
                .map(cityDao::findCityById)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());

        Optional<City> city = cityList.stream().collect(Collectors.maxBy(Comparator.comparing(City::getPopulation)));
        city.ifPresent(System.out::println);*/

/*        countryDao.findAllCountries()
                .stream()
                .map(country -> country.getCapital())
                .map(capital -> cityDao.findCityById(capital))
                .filter(Objects::nonNull)
                .forEach(w-> System.out.println(w.toString()));*/
    }
}
