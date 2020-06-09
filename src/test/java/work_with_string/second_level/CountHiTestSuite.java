package work_with_string.second_level;

import org.junit.Assert;
import org.junit.Test;

public class CountHiTestSuite {
    @Test
    public void test1() {
        Assert.assertEquals(0, CountHi.countHi("", "hi"));
    }

    @Test
    public void test2() {
        Assert.assertEquals(0, CountHi.countHi("h", "hi"));
    }

    @Test
    public void test3() {
        Assert.assertEquals(1, CountHi.countHi("hi", "hi"));
    }

    @Test
    public void test4() {
        Assert.assertEquals(1, CountHi.countHi("abc hi ho", "hi"));
    }

    @Test
    public void test5() {
        Assert.assertEquals(2, CountHi.countHi("hiho not HOHIhi", "hi"));
    }

    @Test
    public void test6() {
        Assert.assertEquals(2, CountHi.countHi("hiHIhi", "hi"));
    }
}
