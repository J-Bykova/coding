package work_with_array.first_level;

import org.junit.Assert;
import org.junit.Test;

public class BiggerTwoTestSuite {
    @Test
    public void should_return_firstArr_with_bigger_sum() {
        int[] firstArr = {3, 4};
        int[] secondArr = {1, 2};
        Assert.assertEquals(firstArr, BiggerTwo.biggerTwo(firstArr, secondArr));
    }

    @Test
    public void should_return_secondArr_with_bigger_sum() {
        int[] firstArr = {1, 2};
        int[] secondArr = {3, 4};
        Assert.assertEquals(secondArr, BiggerTwo.biggerTwo(firstArr, secondArr));
    }

    @Test
    public void should_return_firstArr_if_sum_is_same() {
        int[] firstArr = {1, 3};
        int[] secondArr = {2, 2};
        Assert.assertEquals(firstArr, BiggerTwo.biggerTwo(firstArr, secondArr));
    }


}
