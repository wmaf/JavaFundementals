package com.careerdevs.intro.objectcompanyfactory;

public class Company {
    //fields: name (String), yearEstablished (short), marketCap (double)
    public String name;
    public Short yearEstablished;
    public double marketCap;

    public Company (String name,Short yearEstablished, double marketCap){
        this.name = name;
        this.yearEstablished = yearEstablished;
        this.marketCap = marketCap;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", yearEstablished=" + yearEstablished +
                ", marketCap=" + marketCap +
                '}';
    }
}
