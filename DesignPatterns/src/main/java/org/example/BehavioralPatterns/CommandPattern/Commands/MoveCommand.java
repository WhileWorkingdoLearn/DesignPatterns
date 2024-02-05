package org.example.BehavioralPatterns.CommandPattern.Commands;

import org.example.BehavioralPatterns.CommandPattern.Orders;

public class MoveCommand extends  Command{

    public MoveCommand(Orders soldier) {
        super(soldier);
    }

    @Override
    public void execute() {
        soldier.move();
    }

    @Override
    public void cancel() {
        soldier.cancel();
    }
}
