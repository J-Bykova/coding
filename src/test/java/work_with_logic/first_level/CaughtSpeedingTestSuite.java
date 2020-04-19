package work_with_logic.first_level;

import org.junit.Assert;
import org.junit.Test;

public class CaughtSpeedingTestSuite {
    @Test
    public void test1() {
        Assert.assertEquals(0, CaughtSpeeding.caughtSpeeding(60, false));
    }

    @Test
    public void test2() {
        Assert.assertEquals(1, CaughtSpeeding.caughtSpeeding(65, false));
    }

    @Test
    public void test3() {
        Assert.assertEquals(0, CaughtSpeeding.caughtSpeeding(65, true));
    }
}
