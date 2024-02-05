package org.example.CreationalPattern.AbstractFactory.Factories;

import org.example.CreationalPattern.AbstractFactory.Templates.AbstractAirCraftFactory;
import org.example.CreationalPattern.AbstractFactory.Factories.Planes.PropPlane;

public class PropellerPlaneFactory extends AbstractAirCraftFactory<PropPlane> {

    @Override
    public PropPlane createAirCraft() {
        PropPlane plane = new  PropPlane();
        plane.setPropellers(2);
        plane.setWheels(3);
        plane.setMaxSpeed(300);
        System.out.println("PropellerPlane Created");
        return plane;
    }
}
