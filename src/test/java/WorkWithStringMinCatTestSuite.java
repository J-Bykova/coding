import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WorkWithStringMinCatTestSuite {
    @Test
    public void test1() {
        assertEquals("", WorkWithString.minCat("abc", ""));
    }

    @Test
    public void test2() {
        assertEquals("", WorkWithString.minCat("", "abc"));
    }

    @Test
    public void test3() {
        assertEquals("xc", WorkWithString.minCat("x", "abc"));
    }

    @Test
    public void test4() {
        assertEquals("cx", WorkWithString.minCat("abc", "x"));
    }

    @Test
    public void test5() {
        assertEquals("elloJava", WorkWithString.minCat("Hello", "Java"));
    }

    @Test
    public void test6() {
        assertEquals("Javaello", WorkWithString.minCat("Java", "Hello"));
    }


}
