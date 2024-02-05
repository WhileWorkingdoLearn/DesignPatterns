package org.example.BehavioralPatterns.CommandPattern.Commands;

import org.example.BehavioralPatterns.CommandPattern.Orders;

public class DefendCommand extends Command{
    public DefendCommand(Orders soldier) {
        super(soldier);
    }

    @Override
    public void execute() {
        soldier.defend();
    }

    @Override
    public void cancel() {
        soldier.cancel();
    }
}
