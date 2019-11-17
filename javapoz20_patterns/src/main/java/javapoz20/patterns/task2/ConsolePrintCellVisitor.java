package javapoz20.patterns.task2;

public class ConsolePrintCellVisitor implements CellVisitor {
    @Override
    public void visitAlive() {
        System.out.print("X");
    }

    @Override
    public void visitDead() {
        System.out.print("-");
    }
}
