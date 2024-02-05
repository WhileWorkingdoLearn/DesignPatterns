package org.example.BehavioralPatterns.VisitorPattern.Visitor;

import org.example.BehavioralPatterns.VisitorPattern.Aircraft;
import org.example.BehavioralPatterns.VisitorPattern.Naval;
import org.example.BehavioralPatterns.VisitorPattern.Template.Visitor;
import org.example.BehavioralPatterns.VisitorPattern.Vehicle;

public class OtherTitleFormatter implements Visitor {
    @Override
    public String visit(Aircraft aircraft) {
        return aircraft.getDescription() + ": 012422411113 -> SeriealNumber from Aircraft-DB";
    }

    @Override
    public String visit(Vehicle vehicle) {
        return vehicle.getBrand() +  ": 888012411113 -> SeriealNumber from Vehicle-DB";
    }

    @Override
    public String visit(Naval naval) {
        return naval.getName() + ": 888012411113 -> SeriealNumber from Navel-Registry";
    }
}
