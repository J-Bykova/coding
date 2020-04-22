package work_with_array.first_level;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumArrTestSuite {
    @Test
    public void should_return_0_if_got_empty_array() {
        int[] inputArr = {};
        int resultSumArr = 0;
        assertEquals(resultSumArr, SumArr.sumArr(inputArr));
    }

    @Test
    public void should_return_sum_all_elements_array() {
        int[] inputArr = {1, 2, 3};
        int resultSumArr = 6;
        assertEquals(resultSumArr, SumArr.sumArr(inputArr));
    }
}
