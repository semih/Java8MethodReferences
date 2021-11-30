package main.exercise2;

import main.exercise2.dao.InMemoryWorldDao;
import main.exercise2.dao.WorldDao;
import main.exercise2.domain.Country;

import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.Comparator.comparingDouble;

public class Solution5 {

    private static final WorldDao worldDao = InMemoryWorldDao.getInstance();

    private static final Predicate<Country> countryZeroPopulationPredicate = country -> country.getPopulation() != 0;
    private static final Comparator<Country> countryDensityComparator = comparingDouble(country -> country.getPopulation() / country.getSurfaceArea());

    // Q.5) Sort the countries by their population densities in descending order ignoring zero population countries
    public static void main(String[] args) {
        worldDao.findAllCountries()
                .stream()
                .filter(countryZeroPopulationPredicate)
                .sorted(countryDensityComparator.reversed())
                .forEach(w -> System.out.println( w.getName() + " " + w.getPopulation() / w.getSurfaceArea() ));
    }
}
