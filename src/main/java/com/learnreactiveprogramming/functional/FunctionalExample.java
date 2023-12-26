package com.learnreactiveprogramming.functional;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionalExample {
    public static void main(String[] args) {
        var namesList = List.of("alex", "ben", "chloe", "adam", "adam");
        var filteredNamesList = namesGraterThanSize(namesList, 3);
        System.out.println("filteredNamesList: " + filteredNamesList);
    }

    private static List<String> namesGraterThanSize(List<String> namesList, int size) {
        return namesList.stream()
                .filter(s -> s.length() > size)
                .map(String::toUpperCase)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}
