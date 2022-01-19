package com.careerdevs.intro.sayhello2;



import java.util.Scanner;  // Imports the Scanner class

public class Main {
    //don't need strings and args as we are accepting input.
    public static void main(String[] args) {
        //Build the scanner
        Scanner myScanner = new Scanner(System.in);
        //Ask the question
        System.out.println("Please enter your first name:");
        // Get the input
        String fName = myScanner.nextLine();
        System.out.println("Please enter your last name:");
        String lName = myScanner.nextLine();
        //Show it to the user
        System.out.println("Hello: " + fName +" "+ lName);

    }
}

