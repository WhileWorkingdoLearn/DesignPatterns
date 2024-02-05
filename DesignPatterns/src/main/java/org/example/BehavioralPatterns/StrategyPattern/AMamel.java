package org.example.BehavioralPatterns.StrategyPattern;

import org.example.BehavioralPatterns.StrategyPattern.RennVerhalten.RennVerhalten;
import org.example.BehavioralPatterns.StrategyPattern.Springverhalten.SpringVerhalten;

public abstract class AMamel {
    protected RennVerhalten rennVerhalten;
    protected SpringVerhalten springVerhalten;

    public AMamel(RennVerhalten rennVerhalten, SpringVerhalten springVerhalten) {
        this.rennVerhalten = rennVerhalten;
        this.springVerhalten = springVerhalten;
    }

    public AMamel() {
    }

    public RennVerhalten getRennVerhalten() {
        return rennVerhalten;
    }

    public void setRennVerhalten(RennVerhalten rennVerhalten) {
        this.rennVerhalten = rennVerhalten;
    }

    public SpringVerhalten getSpringVerhalten() {
        return springVerhalten;
    }

    public void setSpringVerhalten(SpringVerhalten springVerhalten) {
        this.springVerhalten = springVerhalten;
    }
}
