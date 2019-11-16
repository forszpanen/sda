package javapoz20.patterns;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class StrategyTest {

    @Test
    public void shouldSortByTimSort() {
        //Given
        Sorter sorter = new Sorter(1, 3, 4, 2, 8, 0);
        sorter.setSortingStrategy(new TimSortStrategy());

        // When
        sorter.sort();

        // then
        int[] result = sorter.getResult();
        for (int i = 1; i < result.length - 1; i++) {
            assertTrue(result[i - 1] <= result[i]);
        }
    }

    @Test
    public void shouldSortByBubbleSort() {
        //Given
        Sorter sorter = new Sorter(1, 3, 4, 2, 8, 0);
        sorter.setSortingStrategy(new BubbleSortStrategy());

        // When
        sorter.sort();

        // then
        int[] result = sorter.getResult();
        for (int i = 1; i < result.length - 1; i++) {
            assertTrue(result[i - 1] <= result[i]);
        }
    }

}
