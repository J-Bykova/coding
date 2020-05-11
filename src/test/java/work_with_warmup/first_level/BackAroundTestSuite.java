package work_with_warmup.first_level;

import org.junit.Assert;
import org.junit.Test;

public class BackAroundTestSuite {
    @Test
    public void should_return_null_when_got_empty_str() {
        String inputStr = "";
        String expectedStr = "";
        Assert.assertEquals(expectedStr, BackAround.backAround(inputStr));
    }

    @Test
    public void should_return_new_string_with_last_char_added_at_front_and_back_when_length_str_is_1() {
        String inputStr = "a";
        String expectedStr = "aaa";
        Assert.assertEquals(expectedStr, BackAround.backAround(inputStr));
    }

    @Test
    public void should_return_new_string_with_last_char_added_at_front_and_back_when_length_str_is_3() {
        String inputStr = "cat";
        String expectedStr = "tcatt";
        Assert.assertEquals(expectedStr, BackAround.backAround(inputStr));
    }

    @Test
    public void should_return_new_string_with_last_char_added_at_front_and_back_when_length_str_is_5() {
        String inputStr = "Hello";
        String expectedStr = "oHelloo";
        Assert.assertEquals(expectedStr, BackAround.backAround(inputStr));
    }


}
