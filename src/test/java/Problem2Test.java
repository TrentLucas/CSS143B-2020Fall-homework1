import org.junit.Test;

import static org.junit.Assert.*;

public class Problem2Test {

    // Example test
    // Okay to change
    @Test
    public void testBubbleSort() {
        // add your tests here
        int [] list = {5, 2, 1, 8, 7, 10, 22, 2, 4, 16};
        int [] list2 = {1, 2, 2, 4, 5, 7, 8, 10, 16, 22};
        Problem2.bubbleSort(list);
        for (int i = 0; i < list.length; i++) {
            assertEquals(list[i], list2[i]);
        }
    }
}