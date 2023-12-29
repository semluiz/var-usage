package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //before var
        int age = 25;
        //after var
        var age2 = 13;
        //before var
        String name = "Lucas";
        //after var
        var otherName = "Luiz";

        //before var
        List<String> fruits = new ArrayList<>(List.of("Banana", "Papaya", "Lemon"));

        //after var
        var vegetables = new ArrayList<>(List.of("Lettuce", "tomatos", "carrot"));


        System.out.println("Hello world!");
    }
}