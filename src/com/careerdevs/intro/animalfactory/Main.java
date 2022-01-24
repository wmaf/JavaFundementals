package com.careerdevs.intro.animalfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                    // Test constructor
                    //Animal testAnimal = new Animal("Human",(short) 4,true);
                    //System.out.println(testAnimal);
        // create Scanner var
        var scanner = new Scanner(System.in);
        // ask questions
        System.out.println(("Welcome"));
        System.out.println("What species \nInput: ");
        String speciesInput = scanner.nextLine();

        System.out.println("Number of legs\n(-32k - 32k)");


        // Creating (Animal) instance
       // Animal userGeneratedAnimal = new Animal(speciesInput, legsInput ect.....)

        // output field values for (Animal) instance
        //System.out.println(userGeneratedAnimal);
    }
}
