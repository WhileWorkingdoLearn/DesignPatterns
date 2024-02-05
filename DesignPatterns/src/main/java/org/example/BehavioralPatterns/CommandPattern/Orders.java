package org.example.BehavioralPatterns.CommandPattern;

public interface Orders {
    boolean move();
    boolean hold();
    boolean attack();
    boolean defend();

    void cancel();
}
