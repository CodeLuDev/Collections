package org.example.service;

import java.util.HashMap;

public class SingerService {
    HashMap <String,String> singers;

    public SingerService() {
        singers = new HashMap<>();
    }

    public HashMap<String,String> getSingers() {
        return singers;
    }

    public void addSinger(String name, String bestSeller) {
        singers.put(name,bestSeller);
    }

    public void removeSinger(String name) {
        singers.remove(name);
    }
}
