package work_with_logic.first_level;

import org.junit.Assert;
import org.junit.Test;

public class TeenSumTestSuite {
    @Test
    public void test1() {
        Assert.assertEquals(7, TeenSum.teenSum(3, 4));
    }

    @Test
    public void test2() {
        Assert.assertEquals(19, TeenSum.teenSum(10, 13));
    }

    @Test
    public void test3() {
        Assert.assertEquals(19, TeenSum.teenSum(13, 2));
    }
}
