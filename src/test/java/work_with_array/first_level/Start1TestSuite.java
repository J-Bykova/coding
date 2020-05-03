package work_with_array.first_level;

import org.junit.Assert;
import org.junit.Test;

public class Start1TestSuite {
    @Test
    public void should_return_0_if_no_arrays_starts_with_1() {
        int[] arrFirst = {9, 2, 3};
        int[] arrSecond = {2, 3, 5};
        int expected = 0;
        Assert.assertEquals(expected, Start1.start1(arrFirst, arrSecond));
    }

    @Test
    public void should_return_1_if_one_of_arrays_start_with_1() {
        int[] arrFirst = {1, 2, 3};
        int[] arrSecond = {2, 3, 5};
        int expected = 1;
        Assert.assertEquals(expected, Start1.start1(arrFirst, arrSecond));
    }

    @Test
    public void should_return_2_if_both_arrays_start_with_1() {
        int[] arrFirst = {1, 2, 3};
        int[] arrSecond = {1, 3, 5};
        int expected = 2;
        Assert.assertEquals(expected, Start1.start1(arrFirst, arrSecond));
    }

    @Test
    public void should_return_1_if_one_of_arrays_is_null_and_second_arr_start_with_1() {
        int[] arrFirst = {};
        int[] arrSecond = {1, 2, 3};
        int expected = 1;
        Assert.assertEquals(expected, Start1.start1(arrFirst, arrSecond));
    }

    @Test
    public void should_return_0_if_both_arrays_are_null() {
        int[] arrFirst = {};
        int[] arrSecond = {};
        int expected = 0;
        Assert.assertEquals(expected, Start1.start1(arrFirst, arrSecond));
    }
}
