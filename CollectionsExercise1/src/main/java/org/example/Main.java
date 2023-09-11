package org.example;
/*
Español
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList. Después de mostrar los perros,
al usuario se le pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro
en la lista. Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.

English
Create a program that reads and stores dog breeds in an ArrayList of type String. He
program will ask for a dog breed in a loop, it will be saved in the list and
then the user will be asked if they want to save another dog or if they want to exit. if you decide
exit, it will display all dogs saved in the ArrayList. After showing the dogs,
the user will be asked for a dog and the list will be traversed with an Iterator, the dog will be searched
on the list. If the dog is in the list, the dog entered by the user will be removed and the list will be displayed
ordered. If the dog is not found in the list, the user will be informed and the
the ordered list.
 */

import org.example.service.DogService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        DogService dogService = new DogService();

        boolean finish = false;
        do {
            System.out.print("Enter a dog breed: ");
            String breed = read.next();
            dogService.addDogToList(breed);

            System.out.print("Do you want to add more? Answer Y for yes and N for no: ");
            String answer = read.next();
            if (answer.equalsIgnoreCase("n")) {
                finish = true;
            }
        } while (!finish);

        System.out.println("\nShowing the list!");
        dogService.dogList();

        System.out.print("\nEnter a dog breed to remove: ");
        String breedToRemove = read.next();
        boolean breedFound = dogService.removeDogToList(breedToRemove);

        if (breedFound) {
            System.out.println("\nShowing the list!");
            dogService.dogList();
        } else {
            System.out.println("The breed doesn't exist in the list!");
        }
    }
}
