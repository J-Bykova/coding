package work_with_array.second_level;

import org.junit.Assert;
import org.junit.Test;

public class BigDiffTestSuite {
    @Test
    public void test1() {
        int[] inputArr = {10, 3, 5, 6};
        int bigDiff = 7;
        Assert.assertEquals(bigDiff, BigDiff.bigDiff(inputArr));
    }

    @Test
    public void test2() {
        int[] inputArr = {7, 2, 10, 9};
        int bigDiff = 8;
        Assert.assertEquals(bigDiff, BigDiff.bigDiff(inputArr));
    }

    @Test
    public void test3() {
        int[] inputArr = {2, 10, 7, 2};
        int bigDiff = 8;
        Assert.assertEquals(bigDiff, BigDiff.bigDiff(inputArr));
    }

    @Test
    public void test4() {
        int[] inputArr = {10, 0};
        int bigDiff = 10;
        Assert.assertEquals(bigDiff, BigDiff.bigDiff(inputArr));
    }

    @Test
    public void test5() {
        int[] inputArr = {2};
        int bigDiff = 0;
        Assert.assertEquals(bigDiff, BigDiff.bigDiff(inputArr));
    }

    @Test
    public void test6() {
        int[] inputArr = {2, 2};
        int bigDiff = 0;
        Assert.assertEquals(bigDiff, BigDiff.bigDiff(inputArr));
    }
}
