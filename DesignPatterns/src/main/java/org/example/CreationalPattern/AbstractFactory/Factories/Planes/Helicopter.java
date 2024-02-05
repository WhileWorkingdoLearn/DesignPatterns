package org.example.CreationalPattern.AbstractFactory.Factories.Planes;

import org.example.CreationalPattern.AbstractFactory.Templates.AbstractAirCraft;

public class Helicopter extends AbstractAirCraft {

    private int rotors;

    private int wheels;

    private int maxSpeed;

    public int getRotors() {
        return rotors;
    }

    public void setRotors(int rotors) {
        this.rotors = rotors;
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
        return "Helicopter{" +
                "rotors=" + rotors +
                ", wheels=" + wheels +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    @Override
    public void fly() {
       System.out.println("Helicopter is Flying: " + this);
    }
}
