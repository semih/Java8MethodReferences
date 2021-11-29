package main.exercise2;

import main.exercise2.dao.CountryDao;
import main.exercise2.dao.InMemoryWorldDao;
import main.exercise2.domain.Country;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Solution2 {

    private static final CountryDao countryDao = InMemoryWorldDao.getInstance();
    private static final Comparator<Country> sortByNumberOfCities = Comparator.comparing(country -> country.getCities().size());
    private static Predicate<Country> countriesHaveNoCities = country -> country.getCities().size() > 0;

    // Q.2) Sort the countries by number of their cities in descending order
    public static void main(String[] args) {

        countryDao.findAllCountries()
                .stream()
                .sorted(sortByNumberOfCities)
                .filter(countriesHaveNoCities)
                .collect(Collectors.toList())
                .forEach(country -> System.out.println(String.format("%s %d", country.getName(), country.getCities().size())));
    }

}
