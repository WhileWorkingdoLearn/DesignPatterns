package org.example.BehavioralPatterns.ObserverPattern;

public interface Listener<T> {
    void update(T sender);
}
