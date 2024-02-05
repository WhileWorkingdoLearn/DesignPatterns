package org.example.BehavioralPatterns.CommandPattern.Commands;

import org.example.BehavioralPatterns.CommandPattern.Orders;

public class HoldCommand extends Command{
    public HoldCommand(Orders soldier) {
        super(soldier);
    }

    @Override
    public void execute() {
        soldier.hold();
    }

    @Override
    public void cancel() {
        soldier.cancel();
    }
}
