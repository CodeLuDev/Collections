package org.example.entity;

public class ZipCode {

    private String city;
    private int zipCodeNumber;

    public ZipCode() {
    }

    public ZipCode(String city, int zipCodeNumber) {
        this.city = city;
        this.zipCodeNumber = zipCodeNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipCodeNumber() {
        return zipCodeNumber;
    }

    public void setZipCodeNumber(int zipCodeNumber) {
        this.zipCodeNumber = zipCodeNumber;
    }
}
