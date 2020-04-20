package work_with_warmup.first_level;

import org.junit.Assert;
import org.junit.Test;

public class ParrotTroubleTestSuite {
    @Test
    public void test1() {
        Assert.assertTrue(ParrotTrouble.parrotTrouble(true, 6));
    }

    @Test
    public void test2() {
        Assert.assertFalse(ParrotTrouble.parrotTrouble(true, 7));
    }

    @Test
    public void test3() {
        Assert.assertFalse(ParrotTrouble.parrotTrouble(false, 6));
    }
}
