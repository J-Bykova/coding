package work_with_warmup.first_level;

import org.junit.Assert;
import org.junit.Test;

public class lastDigitTestSuite {
    @Test
    public void test() {
        Assert.assertTrue(lastDigit.lastDigit(7, 17));
    }

    @Test
    public void test1() {
        Assert.assertTrue(lastDigit.lastDigit(27, 17));
    }

    @Test
    public void test2() {
        Assert.assertFalse(lastDigit.lastDigit(2, 17));
    }

    @Test
    public void test3() {
        Assert.assertFalse(lastDigit.lastDigit(42, 17));
    }

}
