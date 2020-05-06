package work_with_array.first_level;

import org.junit.Assert;
import org.junit.Test;

public class PlusTwoTestSuite {
    @Test
    public void should_return_new_array_length_4_containing_all_elements_of_input_arrays() {
        int[] firstArr = {1, 2};
        int[] secondArr = {3, 4};
        int[] expectedArr = {1, 2, 3, 4};
        Assert.assertArrayEquals(expectedArr, PlusTwo.plusTwo(firstArr, secondArr));
    }
}
