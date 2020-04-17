import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WorkWithStringWithout2TestSuite {

    @Test
    public void test1() {
        assertEquals("", WorkWithString.without2(""));
    }

    @Test
    public void test2() {
        assertEquals("x", WorkWithString.without2("x"));
    }

    @Test
    public void test3() {
        assertEquals("", WorkWithString.without2("xx"));
    }

    @Test
    public void test4() {
        assertEquals("", WorkWithString.without2("Hi"));
    }

    @Test
    public void test5() {
        assertEquals("x", WorkWithString.without2("xxx"));
    }

    @Test
    public void test6() {
        assertEquals("lloHe", WorkWithString.without2("HelloHe"));
    }

    @Test
    public void test7() {
        assertEquals("HelloHi", WorkWithString.without2("HelloHi"));
    }
}
