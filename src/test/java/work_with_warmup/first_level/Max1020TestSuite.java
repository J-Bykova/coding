package work_with_warmup.first_level;

import org.junit.Assert;
import org.junit.Test;

public class Max1020TestSuite {
    @Test
    public void test1() {
        Assert.assertEquals(20, Max1020.max1020(10, 20));
    }

    @Test
    public void test2() {
        Assert.assertEquals(19, Max1020.max1020(11, 19));
    }

    @Test
    public void test3() {
        Assert.assertEquals(0, Max1020.max1020(9, 21));
    }

    @Test
    public void test4() {
        Assert.assertEquals(0, Max1020.max1020(9, 20));
    }

    @Test
    public void test5() {
        Assert.assertEquals(0, Max1020.max1020(10, 21));
    }

}
