package service;

import org.example.service.SingerService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingerServiceTest {

    @Test
    public void addSingerTest() {

        SingerService singerService = new SingerService();

        singerService.addSinger("Tananai","Tango");
        singerService.addSinger("Ultimo", "Peter Pan");

        Assertions.assertEquals(2, singerService.getSingers().size());
    }

    @Test
    public void removeSingerTest() {

        SingerService singerService = new SingerService();

        singerService.addSinger("Tananai","Tango");
        singerService.addSinger("Ultimo", "Peter Pan");

        singerService.removeSinger("Tananai");

        Assertions.assertNull(singerService.getSingers().get("Tananai"));
    }
}
