package org.example.CreationalPattern.AbstractFactory.Factories.Planes;


import org.example.CreationalPattern.AbstractFactory.Templates.AbstractAirCraft;

public class Jet extends AbstractAirCraft {

    private int turbines;

    private int wheels;

    private int maxSpeed;

    public int getTurbines() {
        return turbines;
    }

    public void setTurbines(int turbines) {
        this.turbines = turbines;
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
        return "Jet{" +
                "turbines=" + turbines +
                ", wheels=" + wheels +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    @Override
    public void fly() {
        System.out.println("Jet is Flying: " + this);
    }
}
