package test;

import org.example.entity.Country;
import org.example.service.CountryService;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CountryTest {

    @Test
    public void createCountryTest() {

        CountryService countryService = new CountryService();

        //first country
        Country country1 = countryService.createCountry();
        country1.setName("Italy");

        assertEquals("Italy",country1.getName());

        //second country
        Country country2 = countryService.createCountry();
        country2.setName("Spain");

        assertEquals("Spain",country2.getName());

        //third country
        Country country3 = countryService.createCountry();
        country3.setName("Germany");

        assertEquals("Germany",country3.getName());

        //fourth country
        Country country4 = countryService.createCountry();
        country4.setName("France");

        assertEquals("France",country4.getName());
    }

    @Test
    public void addCountryToListTest() {

        CountryService countryService = new CountryService();

        //first country
        countryService.addCountryToList("Italy");

        //second country
        countryService.addCountryToList("Spain");

        //third country
        countryService.addCountryToList("Germany");

        //fourth country
        countryService.addCountryToList("France");

        assertEquals(4, countryService.getCountries().size());

    }

    @Test
    public void verifyAllCountriesHaveANameTest() {

        CountryService countryService = new CountryService();

        //first country
        countryService.addCountryToList("Italy");

        //second country
        countryService.addCountryToList("Spain");

        //third country
        countryService.addCountryToList("Germany");

        //fourth country
        countryService.addCountryToList("France");

        for (Country country : countryService.getCountries()) {
            System.out.println(country);
            assertNotNull(country.getName());//is not empty
        }
    }

    @Test
    public void verifyCountriesAreSortedAlphabeticallyTest() {

        CountryService countryService = new CountryService();

        //first country
        countryService.addCountryToList("Italy");

        //second country
        countryService.addCountryToList("Spain");

        //third country
        countryService.addCountryToList("Germany");

        //fourth country
        countryService.addCountryToList("France");

        List<Country> expectedList = countryService.getCountries();

        assertEquals("France", expectedList.get(0).getName());
        assertEquals("Germany",expectedList.get(1).getName());
        assertEquals("Italy",expectedList.get(2).getName());
        assertEquals("Spain",expectedList.get(3).getName());

    }

    @Test
    public void verifyRemoveCountryTest() {
        CountryService countryService = new CountryService();

        //first country
        countryService.addCountryToList("Italy");

        //second country
        countryService.addCountryToList("Spain");

        //third country
        countryService.addCountryToList("Germany");

        //fourth country
        countryService.addCountryToList("France");

        countryService.removeCountry("France");

        assertEquals(3,countryService.getCountries().size());
    }

}
