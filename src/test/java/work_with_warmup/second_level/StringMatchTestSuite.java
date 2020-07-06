package work_with_warmup.second_level;

import org.junit.Assert;
import org.junit.Test;

public class StringMatchTestSuite {
    @Test
    public void test1() {
        Assert.assertEquals(0, StringMatch.stringMatch("", ""));
    }

    @Test
    public void test2() {
        Assert.assertEquals(0, StringMatch.stringMatch("", "hello"));
    }

    @Test
    public void test3() {
        Assert.assertEquals(0, StringMatch.stringMatch("hello", ""));
    }

    @Test
    public void test7() {
        Assert.assertEquals(0, StringMatch.stringMatch("abc", "axc"));
    }

    @Test
    public void test4() {
        Assert.assertEquals(1, StringMatch.stringMatch("hello", "he"));
    }

    @Test
    public void test5() {
        Assert.assertEquals(1, StringMatch.stringMatch("he", "hello"));
    }

    @Test
    public void test6() {
        Assert.assertEquals(2, StringMatch.stringMatch("abc", "abc"));
    }

    @Test
    public void test8() {
        Assert.assertEquals(3, StringMatch.stringMatch("xxcaazz", "xxbaaz"));
    }

    @Test
    public void test9() {
        Assert.assertEquals(3, StringMatch.stringMatch("aaxxaaxx", "iaxxai"));
    }

}
