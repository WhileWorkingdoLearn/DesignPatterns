package org.example.BehavioralPatterns.ObserverPattern;

public class ObjectWhoListens implements  Listener<StateOfObject>{

    private String listenerState;


    @Override
    public void update(StateOfObject sender) {
        if(sender == null) return;
        System.out.println("update state: " + sender.getState()+ " from " + sender.getClass().getSimpleName() + " for " + this.getClass().getSimpleName() + " : " + this);
        listenerState = sender.getState();

    }
}
