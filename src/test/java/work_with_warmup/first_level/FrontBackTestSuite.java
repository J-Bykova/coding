package work_with_warmup.first_level;

import org.junit.Assert;
import org.junit.Test;

public class FrontBackTestSuite {
    @Test
    public void return_new_string_where_first_and_last_chars_have_been_exchanged_with_long_1() {
        String inputStr = "a";
        String expectedStr = "a";
        Assert.assertEquals(expectedStr, FrontBack.frontBack(inputStr));
    }

    @Test
    public void return_new_string_where_first_and_last_chars_have_been_exchanged_with_long_2() {
        String inputStr = "ab";
        String expectedStr = "ba";
        Assert.assertEquals(expectedStr, FrontBack.frontBack(inputStr));
    }

    @Test
    public void return_new_string_where_first_and_last_chars_have_been_exchanged_with_long_4() {
        String inputStr = "code";
        String expectedStr = "eodc";
        Assert.assertEquals(expectedStr, FrontBack.frontBack(inputStr));
    }
}
