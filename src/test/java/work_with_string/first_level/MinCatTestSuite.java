package work_with_string.first_level;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinCatTestSuite {
    @Test
    public void test1() {
        Assert.assertEquals("", MinCat.minCat("abc", ""));
    }

    @Test
    public void test2() {
        assertEquals("", MinCat.minCat("", "abc"));
    }

    @Test
    public void test3() {
        assertEquals("xc", MinCat.minCat("x", "abc"));
    }

    @Test
    public void test4() {
        assertEquals("cx", MinCat.minCat("abc", "x"));
    }

    @Test
    public void test5() {
        assertEquals("elloJava", MinCat.minCat("Hello", "Java"));
    }

    @Test
    public void test6() {
        assertEquals("Javaello", MinCat.minCat("Java", "Hello"));
    }


}
