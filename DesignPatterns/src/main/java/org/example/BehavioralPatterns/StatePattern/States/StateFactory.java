package org.example.BehavioralPatterns.StatePattern.States;

import org.example.BehavioralPatterns.StatePattern.Human;

public class StateFactory {
    private static class Holder {
        private static StateFactory Instance = new StateFactory();
    }

    private StateFactory(){}

    public static StateFactory getInstance(){return Holder.Instance;}

    public AState getNeutralState(Human human){return new NeutralState(human);}

    public AState getHappyState(Human human){return new HappyState(human);}

    public AState geSadState(Human human){return new SadState(human);}

    public AState getAngryState(Human human){return  new AngryState(human);}

    public AState getArousedState(Human human){return new ArousedState(human);}

}
