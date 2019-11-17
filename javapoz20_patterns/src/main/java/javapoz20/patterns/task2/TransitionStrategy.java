package javapoz20.patterns.task2;

public interface TransitionStrategy {

    Cell evolution(int aliveNeighbours, Cell currentCell);
}
