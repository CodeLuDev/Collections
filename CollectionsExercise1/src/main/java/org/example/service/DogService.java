package org.example.service;

import java.util.*;

public class DogService {

    ArrayList<String> breedDogsList;
    Iterator<String> iterator;

    public DogService() {
        breedDogsList = new ArrayList<>();
    }

    public ArrayList<String> getBreedDogsList() {
        return breedDogsList;
    }

    public void addDogToList(String breedDog) {
        breedDogsList.add(breedDog);
    }

    public void dogList() {
        for (String breed : breedDogsList) {
            System.out.print(breed + " ");
        }
    }

    public boolean removeDogToList(String breedDog) {
        iterator = breedDogsList.iterator();
        boolean breedFound = false;
        while (iterator.hasNext()) {
            if (iterator.next().equalsIgnoreCase(breedDog)) {
                breedFound = true;
                iterator.remove();
            }
        }
        return breedFound;
    }
}

