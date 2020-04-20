package work_with_logic.first_level;

import org.junit.Assert;
import org.junit.Test;

public class More20TestSuite {
    @Test
    public void test1() {
        Assert.assertTrue(More20.more20(21));
    }

    @Test
    public void test2() {
        Assert.assertTrue(More20.more20(22));
    }

    @Test
    public void test3() {
        Assert.assertFalse(More20.more20(20));
    }

    @Test
    public void test4() {
        Assert.assertFalse(More20.more20(23));
    }

    @Test
    public void test5() {
        Assert.assertTrue(More20.more20(41));
    }
}
