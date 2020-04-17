package work_with_string.first_level;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Without2TestSuite {

    @Test
    public void test2() {
        Assert.assertEquals("x", Without2.without2("x"));
    }

    @Test
    public void test3() {
        assertEquals("", Without2.without2("xx"));
    }

    @Test
    public void test4() {
        assertEquals("", Without2.without2("Hi"));
    }

    @Test
    public void test5() {
        assertEquals("x", Without2.without2("xxx"));
    }

    @Test
    public void test6() {
        assertEquals("lloHe", Without2.without2("HelloHe"));
    }

    @Test
    public void test7() {
        assertEquals("HelloHi", Without2.without2("HelloHi"));
    }
}
