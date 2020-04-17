package work_with_string;

import org.junit.Assert;
import org.junit.Test;

public class DeFrontTestSuite {

    @Test
    public void test1() {
        Assert.assertEquals("", DeFront.deFront(""));
    }

    @Test
    public void test2() {
        Assert.assertEquals("a", DeFront.deFront("a"));
    }

    @Test
    public void test3() {
        Assert.assertEquals("ay", DeFront.deFront("axy"));
    }

    @Test
    public void test4() {
        Assert.assertEquals("aay", DeFront.deFront("away"));
    }

    @Test
    public void test5() {
        Assert.assertEquals("a", DeFront.deFront("ax"));
    }

    @Test
    public void test6() {
        Assert.assertEquals("bc", DeFront.deFront("xbc"));
    }

    @Test
    public void test7() {
        Assert.assertEquals("zz", DeFront.deFront("bazz"));
    }

    @Test
    public void test8() {
        Assert.assertEquals("ab", DeFront.deFront("ab"));
    }

    @Test
    public void test9() {
        Assert.assertEquals("abc", DeFront.deFront("abc"));
    }

    @Test
    public void test10() {
        Assert.assertEquals("", DeFront.deFront("hi"));
    }
}
