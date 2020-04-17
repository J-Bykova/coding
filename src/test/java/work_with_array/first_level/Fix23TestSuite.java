package work_with_array.first_level;

import org.junit.Assert;
import org.junit.Test;

public class Fix23TestSuite {

    @Test
    public void test1() {
        int[] input = {2, 3, 4};
        int[] expected = {2, 0, 4};
        Assert.assertArrayEquals(expected, Fix23.fix23(input));
    }

    @Test
    public void test2() {
        int[] input = {2, 2, 4};
        int[] expected = {2, 2, 4};
        Assert.assertArrayEquals(expected, Fix23.fix23(input));
    }

    @Test
    public void test3() {
        int[] input = {1, 2, 2};
        int[] expected = {1, 2, 2};
        Assert.assertArrayEquals(expected, Fix23.fix23(input));
    }
}
