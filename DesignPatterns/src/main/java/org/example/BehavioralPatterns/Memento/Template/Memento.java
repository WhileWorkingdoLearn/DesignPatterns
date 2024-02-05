package org.example.BehavioralPatterns.Memento.Template;

public class Memento<T> {
    private final T state;

    public Memento(T state) {
        this.state = state;
    }

    public T getSavedState(){
        return state;
    }

}
