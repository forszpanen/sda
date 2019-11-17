package javapoz20.patterns.task2;

public class AliveCell implements Cell {
    @Override
    public void accept(CellVisitor cellVisitor) {
        cellVisitor.visitAlive();
    }
}
