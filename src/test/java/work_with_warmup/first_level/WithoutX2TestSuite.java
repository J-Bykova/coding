package work_with_warmup.first_level;

import org.junit.Assert;
import org.junit.Test;

public class WithoutX2TestSuite {
    @Test
    public void test1() {
        Assert.assertEquals("", WithoutX2.withoutX2(""));
    }

    @Test
    public void test2() {
        Assert.assertEquals("", WithoutX2.withoutX2("x"));
    }

    @Test
    public void test3() {
        Assert.assertEquals("", WithoutX2.withoutX2("xx"));
    }

    @Test
    public void test4() {
        Assert.assertEquals("Hi", WithoutX2.withoutX2("xHi"));
    }

    @Test
    public void test5() {
        Assert.assertEquals("Hi", WithoutX2.withoutX2("Hxi"));
    }

    @Test
    public void test6() {
        Assert.assertEquals("Hi", WithoutX2.withoutX2("xxHi"));
    }

    @Test
    public void test7() {
        Assert.assertEquals("Hi", WithoutX2.withoutX2("Hi"));
    }

    @Test
    public void test8() {
        Assert.assertEquals("Hix", WithoutX2.withoutX2("Hix"));
    }

    @Test
    public void test9() {
        Assert.assertEquals("axb", WithoutX2.withoutX2("xaxb"));
    }
}
