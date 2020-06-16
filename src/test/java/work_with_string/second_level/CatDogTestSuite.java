package work_with_string.second_level;

import org.junit.Assert;
import org.junit.Test;

public class CatDogTestSuite {
    @Test
    public void test1() {
        Assert.assertTrue(CatDog.catDog("catdog"));
    }

    @Test
    public void test2() {
        Assert.assertTrue(CatDog.catDog("1cat1cadodog"));
    }

    @Test
    public void test3() {
        Assert.assertTrue(CatDog.catDog("catxdogxdogxcat"));
    }

    @Test
    public void test4() {
        Assert.assertTrue(CatDog.catDog("dogogcat"));
    }

    @Test
    public void test5() {
        Assert.assertTrue(CatDog.catDog("ca"));
    }

    @Test
    public void test6() {
        Assert.assertTrue(CatDog.catDog("c"));
    }

    @Test
    public void test7() {
        Assert.assertTrue(CatDog.catDog(""));
    }

    @Test
    public void test8() {
        Assert.assertFalse(CatDog.catDog("catcat"));
    }

    @Test
    public void test9() {
        Assert.assertFalse(CatDog.catDog("catxxdogxxxdog"));
    }

    @Test
    public void test10() {
        Assert.assertFalse(CatDog.catDog("dog"));
    }

    @Test
    public void test11() {
        Assert.assertFalse(CatDog.catDog("cat"));
    }
}
