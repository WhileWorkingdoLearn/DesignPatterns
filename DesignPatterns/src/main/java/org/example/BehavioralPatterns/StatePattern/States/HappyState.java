package org.example.BehavioralPatterns.StatePattern.States;

import org.example.BehavioralPatterns.StatePattern.Human;

public class HappyState extends AState {
    public HappyState(Human human) {
        super(human);
    }

    @Override
    public void makeCompliment() {
            print("You are so nice to me!");
            human.setStateOfMind(StateFactory.getInstance().getArousedState(human));
    }

    @Override
    public void conversate() {
        print(" That's awesome!");
        human.setStateOfMind(StateFactory.getInstance().getNeutralState(human));
    }

    @Override
    public void insult() {
        print("Why are you saying that!");
        human.setStateOfMind(StateFactory.getInstance().geSadState(human));
    }

    @Override
    public void touch() {
        print("Give me a hug");
    }
}
