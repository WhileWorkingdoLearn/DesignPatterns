package org.example.BehavioralPatterns.ChainOfResponsibility;

public class EventChain {

    private ChainLink chain;

    public EventChain() {
        build();
    }

    private void build(){
        chain = new KeyEvent(new MouseEvent(new TouchPadEvent(null)));
    }

    public void process(String request) {
        chain.process(request);
    }
}
