package org.example.BehavioralPatterns.Mediator;

public abstract class AClient {
    protected  Mediator mediator;

    public AClient(Mediator mediator) {
        this.mediator = mediator;
    }
}
