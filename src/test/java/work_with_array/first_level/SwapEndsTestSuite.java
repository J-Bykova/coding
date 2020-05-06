package work_with_array.first_level;

import org.junit.Assert;
import org.junit.Test;

public class SwapEndsTestSuite {
    @Test
    public void should_return_input_array_if_array_length_is_null() {
        int[] inputArr = {};
        int[] expectedArr = {};
        Assert.assertArrayEquals(expectedArr, SwapEnds.swapEnds(inputArr));
    }

    @Test
    public void should_return_input_array_if_they_length_array_is_1() {
        int[] inputArr = {1};
        int[] expectedArr = {1};
        Assert.assertArrayEquals(expectedArr, SwapEnds.swapEnds(inputArr));
    }

    @Test
    public void should_return_modified_array_where_swap_first_and_last_elements_in_array_where_length_array_is_2() {
        int[] inputArr = {1, 2};
        int[] expectedArr = {2, 1};
        Assert.assertArrayEquals(expectedArr, SwapEnds.swapEnds(inputArr));
    }

    @Test
    public void should_return_modified_array_where_swap_first_and_last_elements_in_array_where_length_array_is_3() {
        int[] inputArr = {1, 2, 3};
        int[] expectedArr = {3, 2, 1};
        Assert.assertArrayEquals(expectedArr, SwapEnds.swapEnds(inputArr));
    }

    @Test
    public void should_return_modified_array_where_swap_first_and_last_elements_in_array_where_length_array_is_4() {
        int[] inputArr = {1, 2, 3, 4};
        int[] expectedArr = {4, 2, 3, 1};
        Assert.assertArrayEquals(expectedArr, SwapEnds.swapEnds(inputArr));
    }

    @Test
    public void should_return_modified_array_where_swap_first_and_last_elements_in_array_where_length_array_is_10() {
        int[] inputArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expectedArr = {10, 2, 3, 4, 5, 6, 7, 8, 9, 1};
        Assert.assertArrayEquals(expectedArr, SwapEnds.swapEnds(inputArr));
    }
}
