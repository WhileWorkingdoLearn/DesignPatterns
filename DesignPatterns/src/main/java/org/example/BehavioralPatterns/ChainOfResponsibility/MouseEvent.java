package org.example.BehavioralPatterns.ChainOfResponsibility;

public class MouseEvent extends ChainLink {
    public MouseEvent(ChainLink nextManager) {
        super(nextManager);
    }

    @Override
    public void process(String request) {
        handleInput(request,"MouseEvent");
    }
}
