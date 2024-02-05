package org.example.BehavioralPatterns.StatePattern;

import org.example.BehavioralPatterns.StatePattern.States.AState;
import org.example.BehavioralPatterns.StatePattern.States.StateOfMind;

public class Paula extends Human{
    private AState stateOfMind;

    public void setStateOfMind(AState stateOfMind) {
            this.stateOfMind = stateOfMind;
    }


    @Override
    public void makeCompliment() {
        if(stateOfMind == null) return;
        stateOfMind.makeCompliment();
    }

    @Override
    public void conversate() {
        if(stateOfMind == null) return;
        stateOfMind.conversate();
    }

    @Override
    public void insult() {
        if(stateOfMind == null) return;
        stateOfMind.insult();
    }

    @Override
    public void touch() {
        if(stateOfMind == null) return;
        stateOfMind.touch();
    }
}
