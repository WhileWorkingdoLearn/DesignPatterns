package org.example.BehavioralPatterns.Mediator;

public class Widget extends AClient {


    public Widget(Mediator mediator) {
        super(mediator);
    }

    public void onClickButtonOne(){
        System.out.println(this.getClass().getSimpleName() + ": "  + "Button 1 Pressed");
        this.mediator.enableWeatherMenu();
    }
    public void onClickButtonTwo(){
        System.out.println(this.getClass().getSimpleName() + ": "  + "Button 2 Pressed");

        this.mediator.enableCalendarMenu();
    }
}
