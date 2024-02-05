package org.example.BehavioralPatterns.StrategyPattern.RennVerhalten;

public class GeradeausRennen implements RennVerhalten{
    @Override
    public void renne() {
        System.out.println("Ich renne Geradeaus");
    }
}
