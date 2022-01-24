package com.careerdevs.intro.objectwatchfactory;

import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the watch factory");

        System.out.println("Create your brand name\nEnter it here:");
        String modelName = scanner.nextLine();

        System.out.println("Is this an auto winding watch?\n Enter true or false here:");
        boolean autoWind = scanner.nextBoolean();

        System.out.println("what body casting would you like?\nEnter> Gold, Steel or Titanium\nHere:");
        String bodyCasting = scanner.nextLine();

        System.out.println("what bracelet type would you like?\nEnter> Military Black, Steel or Leather\nHere:");
        String braceletType = scanner.nextLine();

        System.out.println("What body diameter would you like?\nEnter> 47.6, 49.2, 50.8 or 52.4\n Here:");
        float bodyDiameter =scanner.nextFloat();

        System.out.println("Is the watch waterproof?\nEnter> ture or false Here:");
        boolean waterProof = scanner.nextBoolean();

        System.out.println("How my BAR's?\nEnter> 30, 100, 300 or 1000 Here:");
        int pressure = scanner.nextInt();

        WatchFactory userGeneratedWatch = new WatchFactory(modelName,autoWind,bodyCasting,braceletType,bodyDiameter,waterProof,pressure);
        System.out.println(userGeneratedWatch);
    }

}
