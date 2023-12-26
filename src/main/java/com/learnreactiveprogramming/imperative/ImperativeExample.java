package com.learnreactiveprogramming.imperative;

import java.util.ArrayList;
import java.util.List;

public class ImperativeExample {
    public static void main(String[] args) {
        var namesList = List.of("alex", "ben", "chloe", "adam", "adam");
        var filteredNamesList = namesGraterThanSize(namesList, 3);
        System.out.println("filteredNamesList: " + filteredNamesList);
    }

    private static List<String> namesGraterThanSize(List<String> namesList, int size) {
        var newNamesList = new ArrayList<String>();
        var temp = new ArrayList<String>();

        for (String name : namesList) {
            if (name.length() > size && !temp.contains(name)) {
                temp.add(name);
            }
        }

        for (String upper : temp) {
            newNamesList.add(upper.toUpperCase());
        }

        // Implement sorting logic

        return newNamesList;
    }
}
