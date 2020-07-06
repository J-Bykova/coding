package work_with_warmup.first_level;

import org.junit.Assert;
import org.junit.Test;

public class WithoutXTestSuite {
    @Test
    public void test1() {
        Assert.assertEquals("Hi", WithoutX.withoutX("xHix"));
    }

    @Test
    public void test2() {
        Assert.assertEquals("Hi", WithoutX.withoutX("xHi"));
    }

    @Test
    public void test3() {
        Assert.assertEquals("Hi", WithoutX.withoutX("Hix"));
    }

    @Test
    public void test4() {
        Assert.assertEquals("Hxi", WithoutX.withoutX("Hxix"));
    }

    @Test
    public void test5() {
        Assert.assertEquals("", WithoutX.withoutX(""));
    }

    @Test
    public void test6() {
        Assert.assertEquals("", WithoutX.withoutX("xx"));
    }

    @Test
    public void test7() {
        Assert.assertEquals("", WithoutX.withoutX("x"));
    }

    @Test
    public void test8() {
        Assert.assertEquals("Hello", WithoutX.withoutX("Hello"));
    }
}
