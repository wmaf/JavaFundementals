package com.careerdevs;

public class Main {

    public static void main(String[] args) {
//       System.out.println("Hello");
//       Constructor myConstructor = new Constructor("Bill", 60);
//       System.out.println(myConstructor.name);


    Car myCars1 = new Car("Chevy", "Camaro 2SS",   10000, 0.10);
    Car myCars2 = new Car("Ford"," Mustang GT", 30000, 0.50);
    Car myCars3 = new Car("Dodge","Hellcat", 100, 0.90);
        System.out.println(myCars1.make +" "+ myCars1.model +" "+ myCars1.mileage +" "+ myCars1.gasTankPercent);
        System.out.println(myCars2.make +" "+ myCars2.model +" "+ myCars2.mileage +" "+ myCars2.gasTankPercent);
        System.out.println(myCars3.make +" "+ myCars3.model +" "+ myCars3.mileage +" "+ myCars3.gasTankPercent);
    }

}
