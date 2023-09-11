package org.example.service;

import java.util.ArrayList;

public class NumberService {

    ArrayList<Integer> numbersList;

    public NumberService() {
        numbersList = new ArrayList<>();
    }

    public ArrayList<Integer> getNumbersList() {
        return numbersList;
    }

    public void addNumberToList(int[] numbers) {
        for (int num : numbers) {
            if (num != -99) {
                numbersList.add(num);
            }
        }
    }

    public void numbersList(int[] numbers) {
        for (int num : numbers) {
            if (num != -99) {
                System.out.print(num + " ");;
            }
        }
    }

    public int sumNumbers(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            if (num != -99){
                sum += num;
            }
        }
        return sum;
    }

    public double averageNumbers(int[] numbers) {
        double average = 0;
        int counter = 0;
        for (int num : numbers) {
            if (num != -99) {
                average += num;
                counter ++;
            }
        }
        return (double) Math.round(average / counter);
    }

}
