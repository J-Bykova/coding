package work_with_array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Double23TestsSuite {
    @Test
    public void test1() {
        int[] arr = {};
        Assert.assertFalse(Double23.double23(arr));
    }

    @Test
    public void test2() {
        int[] arr = {1};
        Assert.assertFalse(Double23.double23(arr));
    }

    @Test
    public void test3() {
        int[] arr = {2, 2};
        Assert.assertTrue(Double23.double23(arr));
    }

    @Test
    public void test4() {
        int[] arr = {3, 3};
        Assert.assertTrue(Double23.double23(arr));
    }

    @Test
    public void test5() {
        int[] arr = {2, 3};
        Assert.assertFalse(Double23.double23(arr));
    }
}
