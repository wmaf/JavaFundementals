package com.careerdevs.asktheuser;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner myWork = new Scanner(System.in);
        System.out.println("Type in a string:");
        String myResponseString = myWork.nextLine();
        System.out.println("You entered: " + myResponseString);

        System.out.println("What is the numerical day you were born on?");
        byte myResponseByte = myWork.nextByte();
        System.out.println("You entered the: " + myResponseByte);

        System.out.println("What is the maximum ceiling of class C airspace in feet?");
        Short myResponseShort = myWork.nextShort();
        System.out.println("You entered the: " + myResponseShort);

        System.out.println("Enter a number between 0 and 2,147,483,647");
        int myResponseInt = myWork.nextInt();
        System.out.println("You entered: " + myResponseInt);

        System.out.println("Enter a number between 0.0 and 1.9");
        Float myResponseFloat = myWork.nextFloat();
        System.out.println("You entered: " + myResponseFloat);

        System.out.println("Enter a a positive or negative Quintillion number :)");
        Long myResponseLong = myWork.nextLong();
        System.out.println("You entered: " + myResponseLong);

        System.out.println("Enter a number between 0.000 and 1.009");
        Double myResponseDouble = myWork.nextDouble();
        System.out.println("You entered: " + myResponseDouble);


        System.out.println("enter true or false:");
        Boolean myResponseBoolean = myWork.nextBoolean();
        System.out.println("You entered: " + myResponseBoolean);

    }
}
