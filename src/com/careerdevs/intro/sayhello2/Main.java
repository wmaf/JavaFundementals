package com.careerdevs.intro.sayhello2;

import java.util.Scanner;  // Imports the Scanner class

class Main {
    public static void main(String[] args) {
        //Build the scanner
        Scanner myScanner = new Scanner(System.in);
        //Ask the question
        System.out.println("Please enter your name:");
        // Get the input
        String name = myScanner.nextLine();
        //Show it to the user
        System.out.println("Hello: " + name);

    }
}
