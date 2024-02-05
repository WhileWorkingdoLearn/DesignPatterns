package org.example.BehavioralPatterns.VisitorPattern;

import org.example.BehavioralPatterns.VisitorPattern.Template.AcceptVisitor;

public abstract class Vehicle implements AcceptVisitor {
    private final String brand;


    protected Vehicle(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
