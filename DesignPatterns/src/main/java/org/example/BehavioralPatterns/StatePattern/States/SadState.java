package org.example.BehavioralPatterns.StatePattern.States;

import org.example.BehavioralPatterns.StatePattern.Human;

public class SadState extends AState {
    public SadState(Human human) {
        super(human);
    }

    @Override
    public void makeCompliment() {
        print("Oh, that is nice, im feeling already better!");
        human.setStateOfMind(StateFactory.getInstance().getHappyState(human));
    }

    @Override
    public void conversate() {
        print("I am feeling Sad");
    }

    @Override
    public void insult() {
        print("You are so mean");
        human.setStateOfMind(StateFactory.getInstance().getAngryState(human));
    }

    @Override
    public void touch() {
        print("Thank, you i'am feeling already better");
        human.setStateOfMind(StateFactory.getInstance().getNeutralState(human));
    }
}
