package work_with_array.first_level;

import org.junit.Assert;
import org.junit.Test;

public class Double23TestsSuite {
    @Test
    public void should_return_false_if_got_empty_array() {
        int[] inputArr = {};
        Assert.assertFalse(Double23.double23(inputArr));
    }

    @Test
    public void should_return_false_if_got_array_with_one_element() {
        int[] inputArr = {1};
        Assert.assertFalse(Double23.double23(inputArr));
    }

    @Test
    public void should_return_true_if_got_array_contains_2_twice() {
        int[] inputArr = {2, 2};
        Assert.assertTrue(Double23.double23(inputArr));
    }

    @Test
    public void should_return_true_if_got_array_contains_3_twice() {
        int[] inputArr = {3, 3};
        Assert.assertTrue(Double23.double23(inputArr));
    }

    @Test
    public void should_return_false_if_got_array_contains_different_elements() {
        int[] inputArr = {2, 3};
        Assert.assertFalse(Double23.double23(inputArr));
    }
}
