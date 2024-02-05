package org.example.BehavioralPatterns.CommandPattern;

public class Tank implements Orders{

    @Override
    public boolean move() {
        System.out.println("Tank moving to position");
        return false;
    }

    @Override
    public boolean hold() {
        System.out.println("Tank waiting for orders");
        return false;
    }

    @Override
    public boolean attack() {
        System.out.println("Tank attacking position");
        return false;
    }

    @Override
    public boolean defend() {
        System.out.println("Tank Defending to position");
        return false;
    }

    @Override
    public void cancel() {
        System.out.println("Tank cancel order");
    }
}
