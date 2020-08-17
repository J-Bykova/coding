package work_with_warmup.first_level;

import org.junit.Assert;
import org.junit.Test;

public class LoneTeenTestSuite {
    @Test
    public void test1() {
        Assert.assertTrue(LoneTeen.loneTeen(13, 99));
    }

    @Test
    public void test2() {
        Assert.assertTrue(LoneTeen.loneTeen(21, 19));
    }

    @Test
    public void test3() {
        Assert.assertFalse(LoneTeen.loneTeen(13, 19));
    }

    @Test
    public void test4() {
        Assert.assertFalse(LoneTeen.loneTeen(12, 20));
    }

}
