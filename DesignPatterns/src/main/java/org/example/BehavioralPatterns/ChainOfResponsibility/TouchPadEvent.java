package org.example.BehavioralPatterns.ChainOfResponsibility;

public class TouchPadEvent  extends ChainLink {

    public TouchPadEvent(ChainLink nextManager) {
        super(nextManager);
    }

    @Override
    public void process(String request) {
        handleInput(request,"TouchEvent");
    }
}
