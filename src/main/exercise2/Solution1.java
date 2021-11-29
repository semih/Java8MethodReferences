package main.exercise2;

import main.exercise2.dao.CityDao;
import main.exercise2.dao.CountryDao;
import main.exercise2.dao.InMemoryWorldDao;

public class Solution1 {

    private static final CountryDao countryDao = InMemoryWorldDao.getInstance();
    private static final CityDao cityDao = InMemoryWorldDao.getInstance();

    // Q.1) Find the highest populated capital city
    public static void main(String[] args) {

    }
}
