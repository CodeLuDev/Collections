package org.example.service;

import org.example.entity.Country;

import java.util.*;

public class CountryService {

    private HashSet<Country> countrySet = new HashSet<>();

    public List<Country> getCountries() {
        return sortListAlphabetically();
    }

    public Country createCountry() {
        return new Country();
    }

    public void addCountryToList(String name) {
        Country country = new Country();
        country.setName(name);
        countrySet.add(country);
    }

    private List<Country> sortListAlphabetically() {
        List<Country> countries = new ArrayList<>(countrySet);
        countries.sort( (o1, o2) -> o1.getName().compareTo(o2.getName()));

        return countries;
    }

    public void removeCountry(String name) {
        Iterator<Country> countryIterator = countrySet.iterator();

        while (countryIterator.hasNext()) {
            if (countryIterator.next().getName().equals(name)) {
                countryIterator.remove();
            }
        }
    }

}
