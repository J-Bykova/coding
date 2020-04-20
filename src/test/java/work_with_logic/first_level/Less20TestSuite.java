package work_with_logic.first_level;

import org.junit.Assert;
import org.junit.Test;

public class Less20TestSuite {
    @Test
    public void test1() {
        Assert.assertTrue(Less20.less20(18));
    }

    @Test
    public void test2() {
        Assert.assertTrue(Less20.less20(19));
    }

    @Test
    public void test3() {
        Assert.assertFalse(Less20.less20(20));
    }
}
