package work_with_warmup.first_level;

import org.junit.Assert;
import org.junit.Test;

public class MonkeyTroubleTestSuite {
    @Test
    public void test1() {
        Assert.assertTrue(MonkeyTrouble.monkeyTrouble(true, true));
    }

    @Test
    public void test2() {
        Assert.assertTrue(MonkeyTrouble.monkeyTrouble(false, false));
    }

    @Test
    public void test3() {
        Assert.assertFalse(MonkeyTrouble.monkeyTrouble(true, false));
    }

    @Test
    public void test4() {
        Assert.assertFalse(MonkeyTrouble.monkeyTrouble(false, true));
    }
}
