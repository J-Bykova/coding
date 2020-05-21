package work_with_warmup.second_level;

import org.junit.Assert;
import org.junit.Test;

public class StringTimesTestSuite {
    @Test
    public void should_return_string_that_is_1_copies_of_original_string() {
        String inputStr = "Hi";
        int inputNum = 1;
        String expectedStr = "Hi";

        Assert.assertEquals(expectedStr, StringTimes.stringTimes(inputStr, inputNum));
    }

    @Test
    public void should_return_string_that_is_2_copies_of_original_string() {
        String inputStr = "Hi";
        int inputNum = 2;
        String expectedStr = "HiHi";

        Assert.assertEquals(expectedStr, StringTimes.stringTimes(inputStr, inputNum));
    }

    @Test
    public void should_return_string_that_is_3_copies_of_original_string() {
        String inputStr = "Hi";
        int inputNum = 3;
        String expectedStr = "HiHiHi";

        Assert.assertEquals(expectedStr, StringTimes.stringTimes(inputStr, inputNum));
    }
}
