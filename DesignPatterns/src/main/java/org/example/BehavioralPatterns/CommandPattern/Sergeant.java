package org.example.BehavioralPatterns.CommandPattern;

import org.example.BehavioralPatterns.CommandPattern.Commands.Command;

import java.util.Stack;

public class Sergeant {
    protected final Stack<Command> history;

    public Sergeant(){
        history = new Stack<>();
    }

    public void giveOrder(Command command){
        if(command == null)return;
        System.out.println("Comander issuing order");
        command.execute();
        history.push(command);
    }
    public void cancelLastOrder(){
        if(!history.isEmpty()){
            Command command = history.pop();
            if(command != null){
                System.out.println("Comander canceling last order");
                command.cancel();
            }
        }
    }

}
