package work_with_logic.first_level;

import org.junit.Assert;
import org.junit.Test;

public class Old35TestSuite {
    @Test
    public void test1() {
        Assert.assertTrue(Old35.old35(3));
    }

    @Test
    public void test2() {
        Assert.assertTrue(Old35.old35(10));
    }

    @Test
    public void test3() {
        Assert.assertFalse(Old35.old35(15));
    }
}
