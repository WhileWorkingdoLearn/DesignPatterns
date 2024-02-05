package org.example.BehavioralPatterns.Iterator;

public interface Iterator<T> {
    void first();
    void next();
    boolean isDone();
    T currentItem();
}
