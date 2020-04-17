import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WorkWithStringDeFrontTestSuite {
    @Test
    public void test1() {
        assertEquals("", WorkWithString.deFront(""));
    }

    @Test
    public void test2() {
        assertEquals("a", WorkWithString.deFront("a"));
    }

    @Test
    public void test3() {
        assertEquals("ay", WorkWithString.deFront("axy"));
    }

    @Test
    public void test4() {
        assertEquals("aay", WorkWithString.deFront("away"));
    }

    @Test
    public void test5() {
        assertEquals("a", WorkWithString.deFront("ax"));
    }

    @Test
    public void test6() {
        assertEquals("bc", WorkWithString.deFront("xbc"));
    }

    @Test
    public void test7() {
        assertEquals("zz", WorkWithString.deFront("bazz"));
    }

    @Test
    public void test8() {
        assertEquals("ab", WorkWithString.deFront("ab"));
    }

    @Test
    public void test9() {
        assertEquals("abc", WorkWithString.deFront("abc"));
    }

    @Test
    public void test10() {
        assertEquals("", WorkWithString.deFront("hi"));
    }
}
