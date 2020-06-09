package work_with_warmup.second_level;

import org.junit.Assert;
import org.junit.Test;

public class DoubleXTestSuite {
    @Test
    public void test1() {
        Assert.assertTrue(DoubleX.doubleX("axxbb"));
    }

    @Test
    public void test2() {
        Assert.assertTrue(DoubleX.doubleX("xxxxx"));
    }

    @Test
    public void test3() {
        Assert.assertFalse(DoubleX.doubleX("axaxax"));
    }

    @Test
    public void test4() {
        Assert.assertFalse(DoubleX.doubleX(""));
    }
}
