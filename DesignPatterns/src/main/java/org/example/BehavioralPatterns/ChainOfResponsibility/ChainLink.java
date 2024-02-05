package org.example.BehavioralPatterns.ChainOfResponsibility;

public abstract  class ChainLink {

    protected final ChainLink nextManager;

    public ChainLink(ChainLink nextManager){
            this.nextManager = nextManager;
    }

    protected void handleInput(String request,String value){
        if (request == null) return;
        if(request.equalsIgnoreCase(value)){
            System.out.println("Event is " + value);
            return;
        }
        if(nextManager != null){
            nextManager.process(request);
        }
    }
    public abstract void process(String request);
}
