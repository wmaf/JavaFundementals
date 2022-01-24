package com.careerdevs.intro.objectcountryfactory;

public class CountryFactory {
    public String continent;
    public String name;
    public boolean coastal;
    public String climate;
    public long population;

    public CountryFactory(String continent, String name, boolean coastal, String climate, long population){
        this.continent = continent;
        this.name = name;
        this.coastal = coastal;
        this.climate = climate;
        this.population = population;
    }

    @Override
    public String toString() {
        return "CountryFactory{" +
                "continent='" + continent + '\'' +
                ", name='" + name + '\'' +
                ", coastal=" + coastal +
                ", climate='" + climate + '\'' +
                ", population=" + population +
                '}';
    }
}

