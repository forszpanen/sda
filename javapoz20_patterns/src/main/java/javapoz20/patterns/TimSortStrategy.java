package javapoz20.patterns;

import java.util.Arrays;

public class TimSortStrategy implements Sorter.SortingStrategy {
    @Override
    public void sort(int[] args) {
        Arrays.sort(args);
    }
}
