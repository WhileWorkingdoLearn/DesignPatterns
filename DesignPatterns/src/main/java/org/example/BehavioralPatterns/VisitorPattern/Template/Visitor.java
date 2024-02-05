package org.example.BehavioralPatterns.VisitorPattern.Template;

import org.example.BehavioralPatterns.VisitorPattern.Aircraft;
import org.example.BehavioralPatterns.VisitorPattern.Naval;
import org.example.BehavioralPatterns.VisitorPattern.Vehicle;

public interface Visitor {
    String visit(Aircraft aircraft);
    String visit(Vehicle vehicle);
    String visit(Naval naval);
}
