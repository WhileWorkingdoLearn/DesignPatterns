package org.example.CreationalPattern.AbstractFactory.Factories.Planes;

import org.example.CreationalPattern.AbstractFactory.Templates.AbstractAirCraft;

public class PropPlane extends AbstractAirCraft {

    private int propellers;

    private int wheels;

    private int maxSpeed;

    public int getPropellers() {
        return propellers;
    }

    public void setPropellers(int propellers) {
        this.propellers = propellers;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "PropPlane{" +
                "propellers=" + propellers +
                ", wheels=" + wheels +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    @Override
    public void fly() {
        System.out.println("PropellerPlane is Flying: " + this);
    }
}
