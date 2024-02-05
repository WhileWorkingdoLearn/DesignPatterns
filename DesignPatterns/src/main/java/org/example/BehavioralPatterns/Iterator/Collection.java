package org.example.BehavioralPatterns.Iterator;

public interface Collection<I,O> {
     Iterator<O> getIterator(I collection);
}
