package org.example.StructuralPattern.Facade.CoffeeMachine;

public class CoffeeMachine {
    private final CoffeePreparer coffeePreparer;

    private final WaterHeater waterHeater;

    private final MilkHeater milkHeater;

    private final CoffeeMaker coffeeMaker;

    public CoffeeMachine(CoffeeMachineBuilder builder) {
            this.coffeePreparer = builder.getCoffeePreparer();
            this.waterHeater = builder.getWaterHeater();
            this.milkHeater = builder.getMilkHeater();
            this.coffeeMaker = builder.getCoffeeMaker();
    }

    public Coffee makeKCoffee(){
        boolean coffee = false;

        if(coffeePreparer.prepareCoffee()){
            System.out.println("Prepare Coffee...");
            if(waterHeater.heatWater()){
                System.out.println("Heating Water...");
                     if(milkHeater.heatMilk()){
                         System.out.println("Heating Milk...");
                         coffee = true;
                }
              }
          }
        return coffee ? coffeeMaker.makeCoffee() : new Coffee() {
            @Override
            public String getType() {
                return "None";
            }

            @Override
            public boolean drinkCoffee() {
                return false;
            }
        };
    }

    public static class CoffeeMachineBuilder {
        private CoffeePreparer coffeePreparer;
        private  WaterHeater waterHeater;
        private MilkHeater milkHeater;
        private  CoffeeMaker coffeeMaker;

        public CoffeePreparer getCoffeePreparer() {
            return coffeePreparer;
        }

        public WaterHeater getWaterHeater() {
            return waterHeater;
        }

        public MilkHeater getMilkHeater() {
            return milkHeater;
        }

        public CoffeeMaker getCoffeeMaker() {
            return coffeeMaker;
        }

        public CoffeeMachineBuilder setCoffeePreparer(CoffeePreparer coffeePreparer) {
            this.coffeePreparer = coffeePreparer;
            return this;
        }

        public CoffeeMachineBuilder setWaterHeater(WaterHeater waterHeater) {
            this.waterHeater = waterHeater;
            return this;
        }

        public CoffeeMachineBuilder setMilkHeater(MilkHeater milkHeater) {
            this.milkHeater = milkHeater;
            return this;
        }

        public CoffeeMachineBuilder setCoffeeMaker(CoffeeMaker coffeeMaker) {
            this.coffeeMaker = coffeeMaker;
            return this;
        }

        public CoffeeMachine build(){
            return new CoffeeMachine(this);
        }
    }
}
