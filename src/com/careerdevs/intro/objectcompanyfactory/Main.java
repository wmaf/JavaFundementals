package com.careerdevs.intro.objectcompanyfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to create a company");

        System.out.println("Please enter a company name\nEnter here:");
        String name = scanner.nextLine();

        System.out.println("In what year was the company established?\nEnter here:");
        short yearEstablished = scanner.nextShort();

        System.out.println("What is the companies market cap?\n Enter here:");
        double marketCap = scanner.nextDouble();

        Company  userGeneratedCompany = new Company(name,yearEstablished,marketCap);

        System.out.println(userGeneratedCompany);
    }
}
