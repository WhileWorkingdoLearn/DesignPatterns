package org.example.BehavioralPatterns.CommandPattern.Commands;

import org.example.BehavioralPatterns.CommandPattern.Orders;

public class AttackCommand extends Command{
    public AttackCommand(Orders soldier) {
        super(soldier);
    }


    @Override
    public void execute() {
        soldier.attack();
    }

    @Override
    public void cancel() {
        soldier.cancel();
    }
}
