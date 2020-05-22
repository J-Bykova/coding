package work_with_warmup.second_level;

import org.junit.Assert;
import org.junit.Test;

public class CountXXTestSuite {
    @Test
    public void test1() {
        Assert.assertEquals(1, CountXX.countXX("abcxx"));
    }

    @Test
    public void test2() {
        Assert.assertEquals(2, CountXX.countXX("xxx"));
    }

    @Test
    public void test3() {
        Assert.assertEquals(3, CountXX.countXX("xxxx"));
    }

    @Test
    public void test4() {
        Assert.assertEquals(0, CountXX.countXX("x"));
    }

    @Test
    public void test5() {
        Assert.assertEquals(0, CountXX.countXX("hi"));
    }
}
