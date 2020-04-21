package work_with_array.first_level;

import org.junit.Assert;
import org.junit.Test;

public class Fix23TestSuite {

    @Test
    public void should_change_3_to_0_if_there_is_2_in_array_immediately_followed_by_3() {
        int[] inputArr = {2, 3, 4};
        int[] expectedArr = {2, 0, 4};
        Assert.assertArrayEquals(expectedArr, Fix23.fix23(inputArr));
    }

    @Test
    public void should_return_inputArr_if_there_is_not_2_in_array_immediately_followed_by_3() {
        int[] inputArr = {2, 2, 4};
        int[] expectedArr = {2, 2, 4};
        Assert.assertArrayEquals(expectedArr, Fix23.fix23(inputArr));
    }

}
