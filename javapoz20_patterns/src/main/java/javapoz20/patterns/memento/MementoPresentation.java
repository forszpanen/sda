package javapoz20.patterns.memento;

public class MementoPresentation {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.randomState();
        Originator.Memento memento = originator.getMemento();
        originator.printState();
        originator.randomState();
        originator.printState();
        originator.setMemento(memento);
        originator.printState();
    }
}
