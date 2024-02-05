package org.example.StructuralPattern.Composite;

public interface Composite extends Component {
    void add(Component component);
    void remove(int index);

    Component getChild(int index);
}
