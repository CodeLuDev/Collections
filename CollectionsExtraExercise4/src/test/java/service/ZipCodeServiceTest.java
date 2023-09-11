package service;

import org.example.service.ZipCodeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class ZipCodeServiceTest {

    @Test
    public void verifyAddZipCodeToMapTest() {

        ZipCodeService zipCodeService = new ZipCodeService();

        zipCodeService.addZipCodeToMap(50139,"Florence");//Italy
        zipCodeService.addZipCodeToMap(3800,"Interlaken");//Switzerland
        zipCodeService.addZipCodeToMap(42040,"Pachuca");//Mexico
        zipCodeService.addZipCodeToMap(100010,"Beijing");//China
        zipCodeService.addZipCodeToMap(1000005,"Tokyo");//Japan
        zipCodeService.addZipCodeToMap(8390,"Reine");//Norway
        zipCodeService.addZipCodeToMap(84702,"Oia");//Santorini,Greece
        zipCodeService.addZipCodeToMap(3826,"Gimmelwald");//Switzerland
        zipCodeService.addZipCodeToMap(4260,"Bled");//Slovenia
        zipCodeService.addZipCodeToMap(68000,"Colmar");//France

        Assertions.assertEquals(10,zipCodeService.getZipCodeMap().size());

    }

    @Test
    public void verifyShowingMapTest() {

        ZipCodeService zipCodeService = new ZipCodeService();

        zipCodeService.addZipCodeToMap(50139,"Florence");//Italy
        zipCodeService.addZipCodeToMap(3800,"Interlaken");//Switzerland
        zipCodeService.addZipCodeToMap(42040,"Pachuca");//Mexico
        zipCodeService.addZipCodeToMap(100010,"Beijing");//China
        zipCodeService.addZipCodeToMap(1000005,"Tokyo");//Japan
        zipCodeService.addZipCodeToMap(8390,"Reine");//Norway
        zipCodeService.addZipCodeToMap(84702,"Oia");//Santorini,Greece
        zipCodeService.addZipCodeToMap(3826,"Gimmelwald");//Switzerland
        zipCodeService.addZipCodeToMap(4260,"Bled");//Slovenia
        zipCodeService.addZipCodeToMap(68000,"Colmar");//France

        for (Map.Entry<Integer,String> entry : zipCodeService.getZipCodeMap().entrySet()) {
            System.out.println("City: " + entry.getValue() + " - zip code: " + entry.getKey());
            Assertions.assertNotNull(entry.getKey());
        }
    }

    @Test
    public void verifyIfCityExistTest() {

        ZipCodeService zipCodeService = new ZipCodeService();

        zipCodeService.addZipCodeToMap(50139,"Florence");//Italy
        zipCodeService.addZipCodeToMap(3800,"Interlaken");//Switzerland
        zipCodeService.addZipCodeToMap(42040,"Pachuca");//Mexico
        zipCodeService.addZipCodeToMap(100010,"Beijing");//China
        zipCodeService.addZipCodeToMap(1000005,"Tokyo");//Japan
        zipCodeService.addZipCodeToMap(8390,"Reine");//Norway
        zipCodeService.addZipCodeToMap(84702,"Oia");//Santorini,Greece
        zipCodeService.addZipCodeToMap(3826,"Gimmelwald");//Switzerland
        zipCodeService.addZipCodeToMap(4260,"Bled");//Slovenia
        zipCodeService.addZipCodeToMap(68000,"Colmar");//France

        boolean existExepted = zipCodeService.ifCityExist(50139);

        Assertions.assertTrue(existExepted);
    }

    @Test
    public void verifyIfRemoveCityTest() {

        ZipCodeService zipCodeService = new ZipCodeService();

        zipCodeService.addZipCodeToMap(50139,"Florence");//Italy
        zipCodeService.addZipCodeToMap(3800,"Interlaken");//Switzerland
        zipCodeService.addZipCodeToMap(42040,"Pachuca");//Mexico
        zipCodeService.addZipCodeToMap(100010,"Beijing");//China
        zipCodeService.addZipCodeToMap(1000005,"Tokyo");//Japan
        zipCodeService.addZipCodeToMap(8390,"Reine");//Norway
        zipCodeService.addZipCodeToMap(84702,"Oia");//Santorini,Greece
        zipCodeService.addZipCodeToMap(3826,"Gimmelwald");//Switzerland
        zipCodeService.addZipCodeToMap(4260,"Bled");//Slovenia
        zipCodeService.addZipCodeToMap(68000,"Colmar");//France

        zipCodeService.removeCity(68000);
        zipCodeService.removeCity(4260);
        zipCodeService.removeCity(3826);

        Assertions.assertEquals(7,zipCodeService.getZipCodeMap().size());
    }
}
