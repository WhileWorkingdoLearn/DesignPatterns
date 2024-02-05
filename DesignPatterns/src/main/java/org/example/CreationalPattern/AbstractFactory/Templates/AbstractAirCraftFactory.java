package org.example.CreationalPattern.AbstractFactory.Templates;

import org.example.CreationalPattern.AbstractFactory.Templates.AbstractAirCraft;

public abstract class AbstractAirCraftFactory<P extends AbstractAirCraft> {
    public abstract P createAirCraft();
}
