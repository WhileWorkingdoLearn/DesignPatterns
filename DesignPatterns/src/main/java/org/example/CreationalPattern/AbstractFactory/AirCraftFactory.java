package org.example.CreationalPattern.AbstractFactory;

import org.example.CreationalPattern.AbstractFactory.Factories.HelicopterFactory;
import org.example.CreationalPattern.AbstractFactory.Factories.JetFactory;
import org.example.CreationalPattern.AbstractFactory.Factories.Planes.Helicopter;
import org.example.CreationalPattern.AbstractFactory.Factories.Planes.Jet;
import org.example.CreationalPattern.AbstractFactory.Factories.Planes.PropPlane;
import org.example.CreationalPattern.AbstractFactory.Factories.PropellerPlaneFactory;

import org.example.CreationalPattern.AbstractFactory.Templates.AbstractAirCraft;
import org.example.CreationalPattern.AbstractFactory.Templates.AbstractAirCraftFactory;

public class AirCraftFactory {

    private final HelicopterFactory helicopterFactory;

    private final PropellerPlaneFactory propellerPlaneFactory;

    private final JetFactory jetFactory;

    private static final AirCraftFactory Instance = new AirCraftFactory();

    public static AirCraftFactory getInstance(){
        return Instance;
    }

    AirCraftFactory() {
            this.helicopterFactory = new HelicopterFactory();
            propellerPlaneFactory = new PropellerPlaneFactory();
            jetFactory = new JetFactory();
    };


    public  <I extends AbstractAirCraftFactory<?>,O extends AbstractAirCraft> O  createAirCraft(Class<I> type) {
        if(type == JetFactory.class){
            return (O) jetFactory.createAirCraft();
        }
        if(type == HelicopterFactory.class){
            return (O) helicopterFactory.createAirCraft();
        }
        if(type == PropellerPlaneFactory.class){
            return (O) propellerPlaneFactory.createAirCraft();
        }

        return  null;
    }

    public void example(){
        Helicopter helicopter =  AirCraftFactory.getInstance().createAirCraft(HelicopterFactory.class);
        helicopter.fly();
        Jet jet = AirCraftFactory.getInstance().createAirCraft(JetFactory.class);
        jet.fly();
        PropPlane plane = AirCraftFactory.getInstance().createAirCraft(PropellerPlaneFactory.class);
        plane.fly();
    }


}
