package work_with_warmup.first_level;

import org.junit.Assert;
import org.junit.Test;

public class SumDoubleTestSuite {
    @Test
    public void test1() {
        Assert.assertEquals(3, SumDouble.sumDouble(1, 2));
    }

    @Test
    public void test2() {
        Assert.assertEquals(5, SumDouble.sumDouble(3, 2));
    }

    @Test
    public void test3() {
        Assert.assertEquals(8, SumDouble.sumDouble(2, 2));
    }

    @Test
    public void test4() {
        Assert.assertEquals(0, SumDouble.sumDouble(0, 0));
    }
}
