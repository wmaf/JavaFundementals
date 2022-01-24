package com.careerdevs.intro.objectfruitfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to create a fruit");

        System.out.println("Please enter a fruit name\nInput:");
        String name = scanner.nextLine();

        System.out.println("Please enter the fruits color\nInput:");
        String color = scanner.nextLine();

        System.out.println("Ids the fruit seedless?\nInput (true/false):");
        boolean hasSeeds = scanner.nextBoolean();

        Fruit userInputFruit = new Fruit(name,color,hasSeeds);
        System.out.println(userInputFruit);
    }
}
//Scrap
//import java.util.SortedMap;
//       import java.util.SplittableRandom;
//        System.out.println("hello fruit");
//
//        Fruit banana = new Fruit("Chakita", "Yellow", true);
//        Fruit grape = new Fruit("Purple", "Yellow", false);
//        System.out.println(apple);
//        System.out.println(grape);
//        System.out.println(banana);
//        System.out.println(grape.name);