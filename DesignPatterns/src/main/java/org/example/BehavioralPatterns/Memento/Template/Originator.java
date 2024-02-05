package org.example.BehavioralPatterns.Memento.Template;

public abstract class Originator<T> {

    private T state;

    public void set(T state){
        this.state = state;
    }

    public Memento<T> saveToMemento(){
        return new Memento<T>(state);
    }
    public void restoreFromMemento(Memento<T> memento){
        state = memento.getSavedState();
    }
}
