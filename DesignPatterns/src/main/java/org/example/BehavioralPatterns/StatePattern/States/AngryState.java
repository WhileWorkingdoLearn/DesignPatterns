package org.example.BehavioralPatterns.StatePattern.States;

import org.example.BehavioralPatterns.StatePattern.Human;

public class AngryState extends AState{

    public AngryState(Human human) {
        super(human);
    }

    @Override
    public void makeCompliment() {
        print("Are youe kidding me?");
    }

    @Override
    public void conversate() {
        print("I see your point");
        human.setStateOfMind(StateFactory.getInstance().geSadState(human));
    }

    @Override
    public void insult() {
        print("Shut up. Thats enough");
    }

    @Override
    public void touch() {
        print("Don't touch me");
    }
}
