package org.example.BehavioralPatterns.StatePattern;

import org.example.BehavioralPatterns.StatePattern.States.AState;
import org.example.BehavioralPatterns.StatePattern.States.StateOfMind;

public abstract class Human {
   public abstract void setStateOfMind(AState stateOfMind);
   abstract void makeCompliment();
   abstract void conversate();
   abstract void insult();
   abstract void touch();
}
