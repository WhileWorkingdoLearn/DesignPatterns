package org.example.BehavioralPatterns.Memento.Example;

public class TextWindow {
    private StringBuilder currentText;

    public TextWindow() {
        this.currentText = new StringBuilder();
    }

    public void addText(String text){
        currentText.append(text);
    }

    public TextMemento save(){
        return new TextMemento(currentText.toString());
    }

    public void restore(TextMemento save){
        currentText = new StringBuilder(save.getText());
    }


    public String print(){
        return this.currentText.toString();
    }
}
