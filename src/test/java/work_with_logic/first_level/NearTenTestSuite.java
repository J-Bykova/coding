package work_with_logic.first_level;

import org.junit.Assert;
import org.junit.Test;

public class NearTenTestSuite {
    @Test
    public void test1() {
        Assert.assertTrue(NearTen.nearTen(12));
    }

    @Test
    public void test2() {
        Assert.assertTrue(NearTen.nearTen(19));
    }

    @Test
    public void test3() {
        Assert.assertFalse(NearTen.nearTen(17));
    }
}
