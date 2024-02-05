package org.example.BehavioralPatterns.Mediator;

public class SubMenuTwo extends  AClient implements SubMenuB{

    public SubMenuTwo(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void activate() {
        System.out.println(this.getClass().getSimpleName() + ": "  + "Activate()");
    }
}
