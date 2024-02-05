package org.example.BehavioralPatterns.ObserverPattern;

public interface Observer<T> {
    void attach(Listener<T> listener);
    void detach(Listener<T> listener);
    void notifyListener(T data);
}
