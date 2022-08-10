package gradle.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MeanOfTwoMeansTest {
     @Test
    public void mean_expected_to_be_two_and_a_half() {
        int[] arr = new int[]{1,3,2,4};
        int x = 2;
        int y = 3;

        assertEquals(2.5, MeanOfTwoMeans.get_mean(arr, x, y));
    }
}
