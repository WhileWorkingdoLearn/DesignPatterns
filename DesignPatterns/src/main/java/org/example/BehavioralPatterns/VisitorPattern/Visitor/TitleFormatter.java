package org.example.BehavioralPatterns.VisitorPattern.Visitor;

import org.example.BehavioralPatterns.VisitorPattern.Aircraft;
import org.example.BehavioralPatterns.VisitorPattern.Naval;
import org.example.BehavioralPatterns.VisitorPattern.Template.Visitor;
import org.example.BehavioralPatterns.VisitorPattern.Vehicle;

public class TitleFormatter implements Visitor {
    @Override
    public String visit(Aircraft aircraft) {
        return aircraft.getDescription() + " is a Aircraft Type";
    }

    @Override
    public String visit(Vehicle vehicle) {
        return vehicle.getBrand() + " is a LandVehicle Type";
    }

    @Override
    public String visit(Naval naval) {
        return naval.getName() + " is a Ship Type";
    }
}
