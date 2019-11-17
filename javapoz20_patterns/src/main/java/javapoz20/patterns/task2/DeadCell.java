package javapoz20.patterns.task2;

public class DeadCell implements Cell {
    @Override
    public void accept(CellVisitor cellVisitor) {
        cellVisitor.visitDead();
    }
}
