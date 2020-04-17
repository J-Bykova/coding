package work_with_array.first_level;

import org.junit.Assert;
import org.junit.Test;

public class CommonEndTestSuite {
    @Test
    public void test1() {
        int[] firstArr = {};
        int[] secondArr = {};
        Assert.assertFalse(CommonEnd.commonEnd(firstArr, secondArr));
    }

    @Test
    public void test2() {
        int[] firstArr = {1};
        int[] secondArr = {1};
        Assert.assertTrue(CommonEnd.commonEnd(firstArr, secondArr));
    }

    @Test
    public void test3() {
        int[] firstArr = {1, 2, 3};
        int[] secondArr = {5, 2, 3};
        Assert.assertTrue(CommonEnd.commonEnd(firstArr, secondArr));
    }

    @Test
    public void test4() {
        int[] firstArr = {1, 2, 3, 4, 5};
        int[] secondArr = {4, 5};
        Assert.assertTrue(CommonEnd.commonEnd(firstArr, secondArr));
    }

    @Test
    public void test5() {
        int[] firstArr = {1, 2, 3};
        int[] secondArr = {3, 2, 1};
        Assert.assertFalse(CommonEnd.commonEnd(firstArr, secondArr));
    }
    @Test
    public void test6() {
        int[] firstArr = {1, 2, 3};
        int[] secondArr = {1, 2, 4};
        Assert.assertTrue(CommonEnd.commonEnd(firstArr, secondArr));
    }
}
