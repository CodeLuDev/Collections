package org.example.service;

import java.util.HashMap;
import java.util.Map;

public class ZipCodeService {

    HashMap<Integer,String> zipCodeMap;

    public ZipCodeService() {
        zipCodeMap = new HashMap<>();
    }

    public HashMap<Integer,String> getZipCodeMap() {
        return  zipCodeMap;
    }

    public void addZipCodeToMap(Integer zipCodeNumber,String city) {
        zipCodeMap.put(zipCodeNumber,city);
    }

    public boolean ifCityExist(Integer zipCodeNumber) {
        boolean exist = false;
        for (Map.Entry<Integer, String> entry : zipCodeMap.entrySet()) {
            if (zipCodeMap.containsKey(zipCodeNumber) ) {
                exist = true;
                break;
            }
        }
        return exist;
    }

    public void removeCity(int zipCodeToRemove) {
        boolean exist = ifCityExist(zipCodeToRemove);
        if (exist) {
            zipCodeMap.remove(zipCodeToRemove);
        }
    }

}
