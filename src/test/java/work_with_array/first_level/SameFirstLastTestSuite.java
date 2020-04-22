package work_with_array.first_level;

import org.junit.Assert;
import org.junit.Test;

public class SameFirstLastTestSuite {
    @Test
    public void should_return_false_if_got_empty_array() {
        int[] arr = {};
        Assert.assertFalse(SameFirstLast.sameFirstLast(arr));
    }

    @Test
    public void should_return_true_if__array_size_is_1() {
        int[] arr = {1};
        Assert.assertTrue(SameFirstLast.sameFirstLast(arr));
    }

    @Test
    public void should_return_true_if_the_first_element_and_the_last_element_are_equal_for_array_size_is_2() {
        int[] arr = {1, 1};
        Assert.assertTrue(SameFirstLast.sameFirstLast(arr));
    }

    @Test
    public void should_return_true_if_the_first_element_and_the_last_element_are_equal_for_array_size_is_4() {
        int[] arr = {1, 2, 3, 1};
        Assert.assertTrue(SameFirstLast.sameFirstLast(arr));
    }

    @Test
    public void should_return_true_if_the_first_element_and_the_last_element_are_equal_for_array_size_is_3() {
        int[] arr = {1, 2, 3};
        Assert.assertFalse(SameFirstLast.sameFirstLast(arr));
    }
}
