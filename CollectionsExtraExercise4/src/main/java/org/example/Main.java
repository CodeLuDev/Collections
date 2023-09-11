package org.example;

import org.example.service.ZipCodeService;

import java.util.Map;
import java.util.Scanner;

/*
Español
Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta
página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el
número.
• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
• Muestra por pantalla los datos introducidos
• Pide un código postal y muestra la ciudad asociada si existe sino avisa al usuario.
• Muestra por pantalla los datos
• Agregar una ciudad con su código postal correspondiente más al HashMap.
• Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
• Muestra por pantalla los datos

English
Stores in a HashMap the postal codes of 10 cities of this choice
page: https://mapanet.eu/index.htm. Note: Put the zip code without the letter, just the
number.
• Ask the user to enter 10 zip codes and their cities.
• Displays the data entered on the screen
• Requests a postal code and shows the associated city if it exists, but notifies the user.
• Displays the data on the screen
• Add a city with its corresponding zip code to the HashMap.
• Eliminates 3 existing cities within the HashMap, that the user requests.
• Displays the data on the screen
 */
public class Main {
    public static void main(String[] args) {

        ZipCodeService zipCodeService = new ZipCodeService();
        Scanner read = new Scanner(System.in);

        System.out.println("Enter 10 zip code with his city");
        for (int i=0; i<11;i++) {
            System.out.print("City "+ (i+1) +": ");
            String city = read.next();
            System.out.print("Zip code: ");
            int zipCodeNumber = read.nextInt();

            zipCodeService.addZipCodeToMap(zipCodeNumber,city);
        }

        //showing map
        for (Map.Entry<Integer,String> entry : zipCodeService.getZipCodeMap().entrySet()) {
            System.out.println("City: " + entry.getValue() + " - zip code: " + entry.getKey());
        }

        //looking for a zip code
        System.out.print("Enter a zip code to find it on the map: ");
        int zipCode = read.nextInt();
        boolean foudZipCode = zipCodeService.ifCityExist(zipCode);

        if (foudZipCode) {
            for (Map.Entry<Integer,String> entry : zipCodeService.getZipCodeMap().entrySet()) {
                if (entry.getKey().equals(zipCode)) {
                    System.out.println("City: " + entry.getValue() + " - zip code: " + entry.getKey());
                }
            }
        } else {
            System.out.println("Code zip doesn't corresponds to no city");
        }

        //add a new zip code
        System.out.println("Enter a new city with his zip code to add them on the map");
        System.out.print("City: ");
        String newCity = read.next();
        System.out.print("Zip code: ");
        int newZipCode = read.nextInt();
        zipCodeService.addZipCodeToMap(newZipCode,newCity);

        //showing new map
        for (Map.Entry<Integer,String> entry : zipCodeService.getZipCodeMap().entrySet()) {
            System.out.println("City: " + entry.getValue() + " - zip code: " + entry.getKey());
        }

        //remove 3 cities
        System.out.print("Eliminate 3 zip codes. Which zip codes do you want to remove?: ");
        for (int i=0; i<3; i++) {
            System.out.print("Zip code "+(i+1)+": ");
            int cityToRemove = read.nextInt();
            zipCodeService.removeCity(cityToRemove);
        }

        //showing new map
        for (Map.Entry<Integer,String> entry : zipCodeService.getZipCodeMap().entrySet()) {
            System.out.println("City: " + entry.getValue() + " - zip code: " + entry.getKey());
        }

    }
}