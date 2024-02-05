package org.example.CreationalPattern.AbstractFactory.Factories;

import org.example.CreationalPattern.AbstractFactory.Templates.AbstractAirCraftFactory;
import org.example.CreationalPattern.AbstractFactory.Factories.Planes.Helicopter;

public class HelicopterFactory extends AbstractAirCraftFactory<Helicopter> {
    @Override
    public Helicopter createAirCraft() {
        Helicopter helicopter = new Helicopter();
        helicopter.setRotors(2);
        helicopter.setWheels(0);
        helicopter.setMaxSpeed(300);
        System.out.println("Helicopter Created");
        return helicopter;
    }

}
