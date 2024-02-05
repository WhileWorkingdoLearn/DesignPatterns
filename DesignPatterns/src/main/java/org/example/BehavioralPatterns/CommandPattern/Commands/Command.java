package org.example.BehavioralPatterns.CommandPattern.Commands;

import org.example.BehavioralPatterns.CommandPattern.Orders;

public abstract class Command {
    protected final Orders soldier;

    public Command(Orders soldier){
        this.soldier = soldier;
    }
    public abstract void execute();

    public abstract void cancel();
}
