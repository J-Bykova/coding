package work_with_array.second_level;

import org.junit.Assert;
import org.junit.Test;

public class CountEvensTestSuite {
    @Test
    public void test1() {
        int[] inputArr = {2, 1, 2, 3, 4};
        int countNums = 3;
        Assert.assertEquals(countNums, CountEvens.countEvens(inputArr));
    }

    @Test
    public void test2() {
        int[] inputArr = {2, 2, 0};
        int countNums = 3;
        Assert.assertEquals(countNums, CountEvens.countEvens(inputArr));
    }

    @Test
    public void test3() {
        int[] inputArr = {1, 3, 5};
        int countNums = 0;
        Assert.assertEquals(countNums, CountEvens.countEvens(inputArr));
    }

}
