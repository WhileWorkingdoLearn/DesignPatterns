package org.example.BehavioralPatterns.VisitorPattern;

import org.example.BehavioralPatterns.VisitorPattern.Template.AcceptVisitor;

public abstract class Naval implements AcceptVisitor {
    private final String name;

    protected Naval(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
