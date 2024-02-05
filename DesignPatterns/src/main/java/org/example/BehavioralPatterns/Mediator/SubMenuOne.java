package org.example.BehavioralPatterns.Mediator;

public class SubMenuOne extends AClient implements SubMenuA {


    public SubMenuOne(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void enable() {
        System.out.println(this.getClass().getSimpleName() + ": "  + "Enable()");
    }

    @Override
    public void setText(String text) {
        System.out.println(this.getClass().getSimpleName() + ": "  + "setText()");
    }
}
