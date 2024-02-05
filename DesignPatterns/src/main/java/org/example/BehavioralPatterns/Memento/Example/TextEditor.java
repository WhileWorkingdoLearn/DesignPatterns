package org.example.BehavioralPatterns.Memento.Example;

public class TextEditor {
    private final TextWindow textWindow;

    private TextMemento savedState;

    public TextEditor(TextWindow textWindow){
        this.textWindow = textWindow;
    }

    public TextEditor(){
        this.textWindow = new TextWindow();
    }
    public void write(String text){
        System.out.println("add Text:" + text);
        this.textWindow.addText(text);
    }

    public void saveState(){
        System.out.println("Saving state");
        savedState = textWindow.save();
    }

    public void undo(){
        System.out.println("Undo");
        textWindow.restore(savedState);
    }

    public void print(){
        System.out.println(textWindow.print());
    }
}
