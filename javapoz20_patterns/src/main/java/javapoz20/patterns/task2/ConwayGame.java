package javapoz20.patterns.task2;

import java.util.Random;

public final class ConwayGame {
    private static ConwayGame instance;
    private final Cell[][] cells = new Cell[10][10];
    private TransitionStrategy transitionStrategy = (x, y) -> new AliveCell();

    public static ConwayGame getInstance() {
        if (instance == null) {
            instance = new ConwayGame();
        }
        return instance;
    }

    private ConwayGame() {
    }

    public void init() {
        Random random = new Random();
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                cells[i][j] = random.nextBoolean() ? new AliveCell() : new DeadCell();
//                cells[i][j] = new DeadCell();
            }
        }
//        cells[2][2] = new AliveCell();
    }

    public void setTransitionStrategy(DefaultTransition defaultTransition) {
        transitionStrategy = defaultTransition;
    }

    public void print() {
        System.out.println("***********************************");
        ConsolePrintCellVisitor printCellVisitor = new ConsolePrintCellVisitor();
        System.out.println("  0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < cells.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < cells[i].length; j++) {

                cells[i][j].accept(printCellVisitor);

                System.out.print(" ");
            }
            System.out.println();
            ;
        }
    }

    public void nextStep() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                int aliveNeighbours = computeAliveNeighbours(i, j);
                Cell currentCell = cells[i][j];
                Cell resultCell = transitionStrategy.evolution(aliveNeighbours, currentCell);
                cells[i][j] = resultCell;
            }
        }
    }

    private int computeAliveNeighbours(int x, int y) {
        int aliveCounter = 0;
        for (int i = Math.max(0, x - 1); i < Math.min(cells.length, x + 2); i++) {
            for (int j = Math.max(0, y - 1); j < Math.min(cells[i].length, y + 2); j++) {
                if (i == x && j == y) {
                    continue;
                }
                if (cells[i][j] instanceof AliveCell) {
                    aliveCounter++;
                }
            }
        }
        return aliveCounter;
    }
}
