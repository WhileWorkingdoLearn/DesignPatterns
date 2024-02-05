package org.example.BehavioralPatterns.ChainOfResponsibility;

public class KeyEvent extends ChainLink {

    public KeyEvent(ChainLink nextManager) {
        super(nextManager);
    }

    @Override
    public void process(String request) {
        handleInput(request,"KeyEvent");
    }
}
