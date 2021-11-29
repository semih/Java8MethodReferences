package main.exercise2;

import main.exercise2.dao.CountryDao;
import main.exercise2.dao.InMemoryWorldDao;
import main.exercise2.domain.City;

import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;

public class Solution7 {

    private static final CountryDao countryDao = InMemoryWorldDao.getInstance();

    private static final BiConsumer<String, Optional<City>> printEntry =
            (k, v) -> {
                City city = v.get();
                System.out.println(k + ": City [ name= " + city.getName() + ", population= " + city.getPopulation() + " ]");
            };

    // Q.7) Find the most populated city of each continent
    public static void main(String[] args) {

    }

}

class ContinentCity implements Map.Entry<String, City> {
    private String continent;
    private City city;

    public ContinentCity(String continent, City city) {
        this.continent = continent;
        this.city = city;
    }

    @Override
    public String getKey() {
        return continent;
    }

    @Override
    public City getValue() {
        return city;
    }

    @Override
    public City setValue(City city) {
        this.city = city;
        return city;
    }
}


