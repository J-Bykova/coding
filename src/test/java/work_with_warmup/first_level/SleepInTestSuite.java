package work_with_warmup.first_level;

import org.junit.Assert;
import org.junit.Test;

public class SleepInTestSuite {
    @Test
    public void test1() {
        Assert.assertTrue(SleepIn.sleepIn(true, true));
    }

    @Test
    public void test2() {
        Assert.assertFalse(SleepIn.sleepIn(true, false));
    }

    @Test
    public void test3() {
        Assert.assertTrue(SleepIn.sleepIn(false, true));
    }

    @Test
    public void test4() {
        Assert.assertTrue(SleepIn.sleepIn(false, false));
    }


}

