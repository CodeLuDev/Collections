package entity;

import org.example.service.DogService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DogTest {

    DogService dogService = new DogService();

    @Test
    public void verifyAddDogToListTest() {

        dogService.addDogToList("Husky");

        Assertions.assertEquals(1, dogService.getBreedDogsList().size());
    }

    @Test
    public void verifyRemoveDogToListTest() {

        //first dog
        dogService.addDogToList("Husky");
        Assertions.assertEquals(1, dogService.getBreedDogsList().size());

        //second dog
        dogService.addDogToList("Labrador");
        Assertions.assertEquals(2, dogService.getBreedDogsList().size());

        //removing dog
        boolean expected = dogService.removeDogToList("Husky");

        Assertions.assertTrue(expected);
        Assertions.assertEquals(1, dogService.getBreedDogsList().size());
    }

    @Test
    public void verifyShowDogTest() {

        //first dog
        dogService.addDogToList("Husky");

        //second dog
        dogService.addDogToList("Labrador");

        dogService.dogList();

        Assertions.assertEquals(2,dogService.getBreedDogsList().size());
    }
}
