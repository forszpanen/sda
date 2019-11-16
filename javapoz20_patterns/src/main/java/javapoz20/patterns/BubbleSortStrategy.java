package javapoz20.patterns;

public class BubbleSortStrategy implements Sorter.SortingStrategy {
    @Override
    public void sort(int[] args) {
        for (int i = 0; i < args.length - 1; i++) {
            for (int j = i; j < args.length; j++) {
                if (args[i] > args[j]) {
                    int temp = args[i];
                    args[i] = args[j];
                    args[j] = temp;
                }
            }
        }
    }
}
