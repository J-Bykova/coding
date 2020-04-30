package work_with_warmup.first_level;

import org.junit.Assert;
import org.junit.Test;

public class NearHundredTestSuite {
    @Test
    public void should_return_true_if_at_input_90() {
        int input = 90;
        Assert.assertTrue(NearHundred.nearHundred(input));
    }

    @Test
    public void should_return_true_if_at_input_100() {
        int input = 100;
        Assert.assertTrue(NearHundred.nearHundred(input));
    }

    @Test
    public void should_return_true_if_at_input_110() {
        int input = 110;
        Assert.assertTrue(NearHundred.nearHundred(input));
    }

    @Test
    public void should_return_true_if_at_input_200() {
        int input = 200;
        Assert.assertTrue(NearHundred.nearHundred(input));
    }

    @Test
    public void should_return_false_if_at_input_111() {
        int input = 111;
        Assert.assertFalse(NearHundred.nearHundred(input));
    }

    @Test
    public void should_return_false_if_at_input_89() {
        int input = 89;
        Assert.assertFalse(NearHundred.nearHundred(input));
    }
}
