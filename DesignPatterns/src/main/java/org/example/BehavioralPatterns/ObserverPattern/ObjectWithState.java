package org.example.BehavioralPatterns.ObserverPattern;

public class ObjectWithState implements StateOfObject{

    private Observer<StateOfObject> observer;

    private String state;

    public ObjectWithState() {
    }

    public void setObserver(Observer<StateOfObject> observer) {
        this.observer = observer;
    }

    public void setState(String state) {
        this.state = state;
        if(this.observer != null){
            System.out.println("changing state");
            System.out.println("notifying Observers:...");
            this.observer.notifyListener(this);
        }
    }

    @Override
    public String getState() {
        return state;
    }
}
