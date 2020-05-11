package work_with_warmup.first_level;

import org.junit.Assert;
import org.junit.Test;

public class Or35TestSuite {
    @Test
    public void should_return_false_if_given_negative_number() {
        int inputNum = -1;
        Assert.assertFalse(Or35.or35(inputNum));
    }

    @Test
    public void should_return_true_if_given_non_negative_number_is_multiple_of_3() {
        int inputNum = 3;
        Assert.assertTrue(Or35.or35(inputNum));
    }

    @Test
    public void should_return_true_if_given_non_negative_number_is_multiple_of_5() {
        int inputNum = 10;
        Assert.assertTrue(Or35.or35(inputNum));
    }

    @Test
    public void should_return_true_if_given_non_negative_number_is_multiple_of_3_and_5() {
        int inputNum = 15;
        Assert.assertTrue(Or35.or35(inputNum));
    }

    @Test
    public void should_return_false_if_given_non_negative_number_is_not_multiple_of_3_and_5() {
        int inputNum = 8;
        Assert.assertFalse(Or35.or35(inputNum));
    }
}
