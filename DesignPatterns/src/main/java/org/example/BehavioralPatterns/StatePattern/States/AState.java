package org.example.BehavioralPatterns.StatePattern.States;

import org.example.BehavioralPatterns.StatePattern.Human;

public abstract class AState implements StateOfMind {
    protected final Human human;

    public AState(Human human){
        this.human = human;
    }

    protected void print(String text){
        System.out.println(text);
    }
}
