package com.careerdevs.intro.objectwatchfactory;

public class WatchFactory {
    String modelName;
    boolean autoWind;
    String bodyCasting;
    String braceletType;
    float bodyDiameter;
    boolean waterproof;
    int pressure;

    public WatchFactory(String modelName, boolean autoWind, String bodyCasting, String braceletType, float bodyDiameter, boolean waterproof, int pressure){
        this.modelName = modelName;
        this.autoWind = autoWind;
        this.bodyCasting = bodyCasting;
        this.braceletType = braceletType;
        this.bodyDiameter = bodyDiameter;
        this.waterproof = waterproof;
        this.pressure = pressure;

    }

    @Override
    public String toString() {
        return "WatchFactory{" +
                "modelName='" + modelName + '\'' +
                ", autoWind=" + autoWind +
                ", bodyCasting='" + bodyCasting + '\'' +
                ", braceletType='" + braceletType + '\'' +
                ", bodyDiameter=" + bodyDiameter +
                ", waterproof=" + waterproof +
                ", pressure=" + pressure +
                '}';
    }
}
