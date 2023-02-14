package org.example.one.collection;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>();
        nameList.add("Adis");
        nameList.add("Zejd");
        nameList.add("Alden");
        nameList.add("Anja");
        nameList.add("Anja");
        nameList.add("Anja");
        nameList.add("Anja");
        nameList.add("Slađana");
        nameList.add("Dejla");

        for (int i = 0; i<nameList.size();i++){
            String name = nameList.get(i);
            System.out.println(name);
        }

        Set<String> setofNames = new TreeSet<>();
        setofNames.add("Adis");
        setofNames.add("Zejd");
        setofNames.add("Alden");
        setofNames.add("Anja");
        setofNames.add("Anja");
        setofNames.add("Anja");
        setofNames.add("Anja");
        setofNames.add("Slađana");
        setofNames.add("Dejla");
        System.out.println();
        System.out.println("Setovi...");
        for (String name : setofNames){
            System.out.println(name);
        }


    }
}
