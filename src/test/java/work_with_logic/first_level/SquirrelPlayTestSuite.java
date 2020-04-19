package work_with_logic.first_level;

import org.junit.Assert;
import org.junit.Test;

public class SquirrelPlayTestSuite {
    @Test
    public void test1() {
        Assert.assertTrue(SquirrelPlay.squirrelPlay(70, false));
    }

    @Test
    public void test2() {
        Assert.assertFalse(SquirrelPlay.squirrelPlay(95, false));
    }

    @Test
    public void test3() {
        Assert.assertTrue(SquirrelPlay.squirrelPlay(95, true));
    }
}
