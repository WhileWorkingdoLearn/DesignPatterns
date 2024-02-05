package org.example.StructuralPattern.Facade;

import org.example.StructuralPattern.Facade.CoffeeMachine.*;

public class CoffeeMachine_Facade {

    private  final CoffeeMachine coffeeMachine;
    public CoffeeMachine_Facade() {
        CoffeePreparer coffeePreparer = () -> true;
        WaterHeater waterHeater = () -> true;
        MilkHeater milkHeater = () -> true;
        CoffeeMaker coffeeMaker = () -> new Coffee() {
            @Override
            public String getType() {
                return "Capuccino";
            }

            @Override
            public boolean drinkCoffee() {
                return true;
            }
        };


        coffeeMachine = new CoffeeMachine.CoffeeMachineBuilder()
                .setCoffeePreparer(coffeePreparer)
                .setWaterHeater(waterHeater)
                .setMilkHeater(milkHeater)
                .setCoffeeMaker(coffeeMaker)
                .build();
    }

    public Coffee makeCoffee(){
        return coffeeMachine.makeKCoffee();
    }
}
