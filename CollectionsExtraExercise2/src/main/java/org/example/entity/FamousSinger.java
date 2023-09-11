package org.example.entity;

public class FamousSinger {

    private String name;
    private String bestSeller;

    public FamousSinger() {
    }

    public FamousSinger(String name, String bestSeller) {
        this.name = name;
        this.bestSeller = bestSeller;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBestSeller() {
        return bestSeller;
    }

    public void setBestSeller(String bestSeller) {
        this.bestSeller = bestSeller;
    }
}
