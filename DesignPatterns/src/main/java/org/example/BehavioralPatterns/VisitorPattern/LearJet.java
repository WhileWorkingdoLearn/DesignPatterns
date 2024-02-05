package org.example.BehavioralPatterns.VisitorPattern;

import org.example.BehavioralPatterns.VisitorPattern.Template.Visitor;

public class LearJet  extends Aircraft{
    public LearJet(String description) {
        super(description);
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);  }
}
