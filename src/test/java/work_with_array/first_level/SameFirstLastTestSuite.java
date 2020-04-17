package work_with_array.first_level;

import org.junit.Assert;
import org.junit.Test;

public class SameFirstLastTestSuite {
    @Test
    public void test1() {
        int[] arr = {};
        Assert.assertFalse(SameFirstLast.sameFirstLast(arr));
    }

    @Test
    public void test2() {
        int[] arr = {1};
        Assert.assertTrue(SameFirstLast.sameFirstLast(arr));
    }

    @Test
    public void test3() {
        int[] arr = {1, 1};
        Assert.assertTrue(SameFirstLast.sameFirstLast(arr));
    }

    @Test
    public void test4() {
        int[] arr = {1, 2, 3, 1};
        Assert.assertTrue(SameFirstLast.sameFirstLast(arr));
    }

    @Test
    public void test5() {
        int[] arr = {1, 2, 3};
        Assert.assertFalse(SameFirstLast.sameFirstLast(arr));
    }
}
