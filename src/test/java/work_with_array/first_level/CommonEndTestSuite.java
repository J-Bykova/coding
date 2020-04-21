package work_with_array.first_level;

import org.junit.Assert;
import org.junit.Test;

public class CommonEndTestSuite {
    @Test
    public void should_return_false_if_got_empty_arrays() {
        int[] firstArr = {};
        int[] secondArr = {};
        Assert.assertFalse(CommonEnd.commonEnd(firstArr, secondArr));
    }

    @Test
    public void should_return_true_if_got_array_with_one_the_same_element() {
        int[] firstArr = {1};
        int[] secondArr = {1};
        Assert.assertTrue(CommonEnd.commonEnd(firstArr, secondArr));
    }

    @Test
    public void should_return_true_if_got_arrays_with_the_same_size_and_the_same_last_element() {
        int[] firstArr = {1, 2, 3};
        int[] secondArr = {5, 2, 3};
        Assert.assertTrue(CommonEnd.commonEnd(firstArr, secondArr));
    }

    @Test
    public void should_return_true_if_got_arrays_with_different_size_and_the_same_last_element() {
        int[] firstArr = {1, 2, 3, 4, 5};
        int[] secondArr = {4, 5};
        Assert.assertTrue(CommonEnd.commonEnd(firstArr, secondArr));
    }

    @Test
    public void should_return_false_if_got_arrays_with_the_same_size_and_the_different_last_element() {
        int[] firstArr = {1, 2, 3};
        int[] secondArr = {3, 2, 1};
        Assert.assertFalse(CommonEnd.commonEnd(firstArr, secondArr));
    }

    @Test
    public void should_return_true_if_got_arrays_with_the_same_size_and_the_same_first_element() {
        int[] firstArr = {1, 2, 3};
        int[] secondArr = {1, 2, 4};
        Assert.assertTrue(CommonEnd.commonEnd(firstArr, secondArr));
    }
}
