package org.example.CreationalPattern.AbstractFactory.Factories;

import org.example.CreationalPattern.AbstractFactory.Templates.AbstractAirCraftFactory;
import org.example.CreationalPattern.AbstractFactory.Factories.Planes.Jet;

public class JetFactory extends AbstractAirCraftFactory<Jet> {


    @Override
    public Jet createAirCraft() {
        Jet plane = new Jet();
        plane.setTurbines(4);
        plane.setWheels(10);
        plane.setMaxSpeed(990);
        System.out.println("Jet Created");
        return plane;
    }
}
