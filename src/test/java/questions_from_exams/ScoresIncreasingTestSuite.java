package questions_from_exams;

import org.junit.Assert;
import org.junit.Test;

public class ScoresIncreasingTestSuite {
    @Test
    public void should_return_false_if_array_is_not_ordered() {
        int[] input = {5, 3, 6, 1};
        Assert.assertFalse(ScoresIncreasing.scoresIncreasing(input));
    }

    @Test
    public void should_return_true_if_each_number_is_equal_than_the_one_before() {
        int[] input = {1, 2, 3, 4};
        Assert.assertTrue(ScoresIncreasing.scoresIncreasing(input));
    }

    @Test
    public void should_return_true_if_each_number_is_equal_than_the_one_before_2() {
        int[] input = {1, 1, 2, 4};
        Assert.assertTrue(ScoresIncreasing.scoresIncreasing(input));
    }
}
