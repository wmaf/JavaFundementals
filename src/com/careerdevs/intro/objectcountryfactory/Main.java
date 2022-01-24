package com.careerdevs.intro.objectcountryfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hello");
        CountryFactory newCountryUsa = new CountryFactory("North America","United States", true,"temperate",100000000L);
        CountryFactory newCountryJapan = new CountryFactory("Asia","Japan", true,"temperate", 20000076L);
        CountryFactory newCountrySudan = new CountryFactory("Africa","Sudan", true,"tropical", 11115000L);
        System.out.println(newCountryJapan);
    }
}
