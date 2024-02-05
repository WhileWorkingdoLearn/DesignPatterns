package org.example.BehavioralPatterns.Mediator;

public class Mediator  {
    protected SubMenuA subMenuOne;
    protected SubMenuB subMenuTwo;

    public Mediator() {
    }

    public void setSubMenuOne(SubMenuA subMenuOne) {
        this.subMenuOne = subMenuOne;
    }

    public void setSubMenuTwo(SubMenuB subMenuTwo) {
        this.subMenuTwo = subMenuTwo;
    }

    public void enableWeatherMenu(){
        if(subMenuOne == null) return;
        System.out.println(this.getClass().getSimpleName() + ": "  + "Enable WeatherMenu");

        subMenuOne.enable();
    }
    public void enableCalendarMenu(){
        if(subMenuTwo == null) return;
        System.out.println(this.getClass().getSimpleName() + ": "  + "Enable CalendarMenu");
        subMenuTwo.activate();
    }
}
