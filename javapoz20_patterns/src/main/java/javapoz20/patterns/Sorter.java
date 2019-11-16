package javapoz20.patterns;

public class Sorter {
    private final int[] argument;
    private SortingStrategy strategy;

    public Sorter(int... args) {
        this.argument = args;
    }

    public void setSortingStrategy(SortingStrategy strat) {
        this.strategy = strat;
    }

    public void sort() {
        if (strategy == null) {
            throw new IllegalStateException("Nie ma strategii.");
        }
        strategy.sort(argument);
    }

    public int[] getResult() {
        return argument;
    }

    public interface SortingStrategy {
        void sort(int[] args);
    }
}
