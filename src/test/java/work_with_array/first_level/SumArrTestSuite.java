package work_with_array.first_level;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumArrTestSuite {
    @Test
    public void should_return_0_if_got_empty_array() {
        int[] arr = {};
        int result = 0;
        assertEquals(result, SumArr.sumArr(arr));
    }

    @Test
    public void should_return_sum_all_elements_array() {
        int[] arr = {1, 2, 3};
        int result = 6;
        assertEquals(result, SumArr.sumArr(arr));
    }
}
