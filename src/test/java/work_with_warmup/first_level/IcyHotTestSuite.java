package work_with_warmup.first_level;

import org.junit.Assert;
import org.junit.Test;

public class IcyHotTestSuite {
    @Test
    public void test() {
        Assert.assertTrue(IcyHot.icyHot(120, -1));
    }

    @Test
    public void test2() {
        Assert.assertTrue(IcyHot.icyHot(-1, 120));
    }

    @Test
    public void test3() {
        Assert.assertTrue(IcyHot.icyHot(101, -1));
    }

    @Test
    public void test4() {
        Assert.assertFalse(IcyHot.icyHot(99, 3));
    }

    @Test
    public void test5() {
        Assert.assertFalse(IcyHot.icyHot(101, 3));
    }

    @Test
    public void test6() {
        Assert.assertFalse(IcyHot.icyHot(-1, 3));
    }
}
