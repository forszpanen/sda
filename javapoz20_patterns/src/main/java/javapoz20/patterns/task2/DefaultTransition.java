package javapoz20.patterns.task2;

public class DefaultTransition implements TransitionStrategy {
    @Override
    public Cell evolution(int aliveNeighbours, Cell currentCell) {
        if (aliveNeighbours == 3) {
            return new AliveCell();
        }
        if (aliveNeighbours == 2 && currentCell instanceof AliveCell) {
            return currentCell;
        }
        return new DeadCell();
    }
}
