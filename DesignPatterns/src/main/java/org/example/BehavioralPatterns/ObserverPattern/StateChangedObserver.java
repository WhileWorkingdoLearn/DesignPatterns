package org.example.BehavioralPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class StateChangedObserver implements Observer<StateOfObject> {

    private final List<Listener<StateOfObject>> listeners;

    public StateChangedObserver() {
        this.listeners = new ArrayList<>();
    }

    @Override
    public void attach(Listener<StateOfObject> listener) {
        if(this.listeners.contains(listener)) return;
        this.listeners.add(listener);
    }

    @Override
    public void detach(Listener<StateOfObject> listener) {
        this.listeners.remove(listener);
    }

    @Override
    public void notifyListener(StateOfObject objectWithState) {
        for (Listener<StateOfObject> listener :listeners) {
            listener.update(objectWithState);
        }
    }
}
