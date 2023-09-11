package org.example.service;

import java.util.HashMap;

public class ShopService {

    private HashMap<String, Integer> productMap;

    public ShopService() {
        productMap = new HashMap<>();
    }

    public HashMap<String, Integer> getProductMap() {
        return productMap;
    }

    public void addProductToList(String product, int price) {
        productMap.put(product, price);
    }

    public void modifyPrice(String product, int newPrice) {
        productMap.replace(product,newPrice);
    }

    public void removeProduct(String product, int price) {
        productMap.remove(product, price);
    }

}
