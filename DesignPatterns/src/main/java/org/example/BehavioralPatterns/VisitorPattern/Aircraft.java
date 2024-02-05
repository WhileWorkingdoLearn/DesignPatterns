package org.example.BehavioralPatterns.VisitorPattern;

import org.example.BehavioralPatterns.VisitorPattern.Template.AcceptVisitor;

public abstract class Aircraft implements AcceptVisitor {
    private final String description;

    public Aircraft(String description) {
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
