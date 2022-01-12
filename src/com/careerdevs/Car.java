package com.careerdevs;

public class Car {
    public String make;
    public String model;
    public int mileage;
    public double gasTankPercent;

    //public Object [] carArr = {};
    public Car(String make, String model, int mileage, float gasTankPercent) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.gasTankPercent = gasTankPercent;

    }
    public String getCar () {
        return make;
    }
}
