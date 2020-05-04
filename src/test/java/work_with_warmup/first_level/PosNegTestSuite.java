package work_with_warmup.first_level;

import org.junit.Assert;
import org.junit.Test;

public class PosNegTestSuite {
    @Test
    public void should_return_true_if_both_are_negative_and_get_true() {
        int inputFirstNum = -1;
        int inputSecondNum = -1;
        Assert.assertTrue(PosNeg.posNeg(inputFirstNum, inputSecondNum, true));
    }

    @Test
    public void should_return_false_if_both_are_negative_and_get_false() {
        int inputFirstNum = -1;
        int inputSecondNum = -1;
        Assert.assertFalse(PosNeg.posNeg(inputFirstNum, inputSecondNum, false));
    }

    @Test
    public void should_return_false_if_one_is_negative_and_one_is_positive_and_get_true() {
        int inputFirstNum = -1;
        int inputSecondNum = 1;
        Assert.assertFalse(PosNeg.posNeg(inputFirstNum, inputSecondNum, true));
    }

    @Test
    public void should_return_true_if_one_is_negative_and_one_is_positive() {
        int inputFirstNum = -1;
        int inputSecondNum = 1;
        Assert.assertTrue(PosNeg.posNeg(inputFirstNum, inputSecondNum, false));
    }

    @Test
    public void should_return_false_if_both_are_positive_and_get_true() {
        int inputFirstNum = 1;
        int inputSecondNum = 1;
        Assert.assertFalse(PosNeg.posNeg(inputFirstNum, inputSecondNum, true));
    }

    @Test
    public void should_return_false_if_both_are_positive_and_get_false() {
        int inputFirstNum = 1;
        int inputSecondNum = 1;
        Assert.assertFalse(PosNeg.posNeg(inputFirstNum, inputSecondNum, false));
    }

}
