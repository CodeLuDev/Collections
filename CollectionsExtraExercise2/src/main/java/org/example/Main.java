package org.example;

import org.example.service.SingerService;
import java.util.HashMap;
import java.util.Scanner;

/*
Español
Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5 objetos
de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada cantante
y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el usuario
elija o de salir del programa. Al final se deberá mostrar la lista con todos los cambios

English
Create a class called FamousSinger. This class will keep famous singers and
It will have as attributes the name and discConMasVentas.
It is also necessary, in the main, to create a list of type FamousSinger and add 5 objects
of type Famous Singer to the list. Then, the names of each singer must be shown
and his album with the most sales per screen.
Once the 5 are added, in another loop, create a menu that gives the user the option of
add one more singer, show all singers, delete a singer than the user
choose or exit the program. At the end, the list with all the changes should be displayed
 */
public class Main {
    public static void main(String[] args) {

        SingerService singerService = new SingerService();
        Scanner read = new Scanner(System.in);

        singerService.addSinger("Tananai", "Tango");
        singerService.addSinger("Ultimo", "Peter Pan");
        singerService.addSinger("Madonna", "Deeper and Deeper");
        singerService.addSinger("Lady Gaga", "BORN THIS WAY");
        singerService.addSinger("Rammstein", "SEHNSUCHT");

        int option;
        do {
            System.out.println("-----MENU-----");

            System.out.println("Chose a option: " +
                    "\n1. Add singer " +
                    "\n2. Show all singers " +
                    "\n3. Remove singer " +
                    "\n4. Exit");
            option = read.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Singer name: ");
                    String nameSinger = read.next();
                    System.out.print("Singer best seller: ");
                    String bestSeller = read.next();
                    singerService.addSinger(nameSinger,bestSeller);
                    break;
                case 2:
                    HashMap<String,String> singers = singerService.getSingers();
                    singers.forEach((name, cd) -> System.out.println("Name: " + name + " Best Seller: " + cd));
                    break;
                case 3:
                    System.out.print("Which singer do you want to remove? ");
                    String nameToRemove = read.next();
                    singerService.removeSinger(nameToRemove);
                    break;
                case 4:
                    System.out.println("Bye Bye!!");
                    break;
                default:
                    System.out.print("Wrong option! Put the right option: ");
                    option = read.nextInt();
            }

        } while (option != 4);

    }
}