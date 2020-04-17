package work_with_array.first_level;

import org.junit.Assert;
import org.junit.Test;

public class FirstLast6TestSuite {

    @Test
    public void test1() {
        int[] arr = {};
        Assert.assertFalse(FirstLast6.firstLast6(arr));
    }

    @Test
    public void test2() {
        int[] arr = {6, 2, 1};
        Assert.assertTrue(FirstLast6.firstLast6(arr));
    }

    @Test
    public void test3() {
        int[] arr = {1, 2, 6};
        Assert.assertTrue(FirstLast6.firstLast6(arr));
    }

    @Test
    public void test4() {
        int[] arr = {1, 2, 6, 4};
        Assert.assertFalse(FirstLast6.firstLast6(arr));
    }

    @Test
    public void test5() {
        int[] arr = {1, 2, 0, 4};
        Assert.assertFalse(FirstLast6.firstLast6(arr));
    }
}
