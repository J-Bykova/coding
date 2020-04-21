package work_with_array.first_level;

import org.junit.Assert;
import org.junit.Test;

public class FirstLast6TestSuite {

    @Test
    public void should_return_false_if_got_empty_array() {
        int[] inputArr = {};
        Assert.assertFalse(FirstLast6.firstLast6(inputArr));
    }

    @Test
    public void should_return_true_if_6_appears_as_the_first_element() {
        int[] inputArr = {6, 2, 1};
        Assert.assertTrue(FirstLast6.firstLast6(inputArr));
    }

    @Test
    public void should_return_true_if_6_appears_as_the_last_element() {
        int[] inputArr = {1, 2, 6};
        Assert.assertTrue(FirstLast6.firstLast6(inputArr));
    }

    @Test
    public void should_return_false_if_in_array_appears_6_as_not_first_and_not_last_element() {
        int[] inputArr = {1, 2, 6, 4};
        Assert.assertFalse(FirstLast6.firstLast6(inputArr));
    }

    @Test
    public void should_return_false_if_in_array_does_not_appear_6() {
        int[] inputArr = {1, 2, 0, 4};
        Assert.assertFalse(FirstLast6.firstLast6(inputArr));
    }
}
