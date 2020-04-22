package work_with_array.first_level;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Sum2TestSuite {
    @Test
    public void should_return_0_if_got_empty_array() {
        int[] inputArr = {};
        int expectedResult = 0;
        assertEquals(expectedResult, Sum2.sum2(inputArr));
    }

    @Test
    public void should_return_first_element_if_array_size_is_1() {
        int[] inputArr = {1};
        int expectedResult = 1;
        assertEquals(expectedResult, Sum2.sum2(inputArr));
    }

    @Test
    public void should_return_sum_first_and_second_elements() {
        int[] inputArr = {1, 2, 3};
        int expectedResult = 3;
        assertEquals(expectedResult, Sum2.sum2(inputArr));
    }
}
