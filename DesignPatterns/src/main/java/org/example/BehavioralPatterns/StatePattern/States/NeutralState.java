package org.example.BehavioralPatterns.StatePattern.States;

import org.example.BehavioralPatterns.StatePattern.Human;

public class NeutralState extends AState {
    private final Human human;

    public NeutralState(Human human) {
        super(human);
        this.human = human;
    }

    @Override
    public void makeCompliment() {
        print("Oh, Thank you");
        human.setStateOfMind(StateFactory.getInstance().getHappyState(human));
    }

    @Override
    public void conversate() {
        print("BLaa blaa blaa");
    }

    @Override
    public void insult() {
        print("That's, rude");
        human.setStateOfMind(StateFactory.getInstance().geSadState(human));
    }

    @Override
    public void touch() {
        print("I feel you");
        human.setStateOfMind(StateFactory.getInstance().getHappyState(human));
    }
}
