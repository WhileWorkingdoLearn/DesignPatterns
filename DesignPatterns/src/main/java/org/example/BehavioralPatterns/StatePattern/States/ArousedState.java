package org.example.BehavioralPatterns.StatePattern.States;

import org.example.BehavioralPatterns.StatePattern.Human;

public class ArousedState extends AState{
    public ArousedState(Human human) {
        super(human);
    }

    @Override
    public void makeCompliment() {
        print("I have something on my mind....");
    }

    @Override
    public void conversate() {
        print("Your eyes are so beautiful");
        human.setStateOfMind(StateFactory.getInstance().getNeutralState(human));
    }

    @Override
    public void insult() {
        print("Talk dirty to me");
    }

    @Override
    public void touch() {
        print("Touch me Here");
    }
}
