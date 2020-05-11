package work_with_warmup.first_level;

import org.junit.Assert;
import org.junit.Test;

public class Front22TestSuite {
    @Test
    public void should_return_empty_str_if_got_empty_str() {
        String inputStr = "";
        String expectedStr = "";
        Assert.assertEquals(expectedStr, Front22.front22_1(inputStr));
    }

    @Test
    public void should_return_string_with_2_chars_added_at_both_front_and_back_where_length_is_1() {
        String inputStr = "a";
        String expectedStr = "aaa";
        Assert.assertEquals(expectedStr, Front22.front22_1(inputStr));
    }

    @Test
    public void should_return_string_with_2_chars_added_at_both_front_and_back_where_length_is_2() {
        String inputStr = "Ab";
        String expectedStr = "AbAbAb";
        Assert.assertEquals(expectedStr, Front22.front22_1(inputStr));
    }

    @Test
    public void should_return_string_with_2_chars_added_at_both_front_and_back_where_length_is_3() {
        String inputStr = "Abc";
        String expectedStr = "AbAbcAb";
        Assert.assertEquals(expectedStr, Front22.front22_1(inputStr));
    }

    @Test
    public void should_return_string_with_2_chars_added_at_both_front_and_back_where_length_is_4() {
        String inputStr = "Abcd";
        String expectedStr = "AbAbcdAb";
        Assert.assertEquals(expectedStr, Front22.front22_1(inputStr));
    }

    @Test
    public void should_return_string_with_2_chars_added_at_both_front_and_back_where_length_is_5() {
        String inputStr = "Abcdv";
        String expectedStr = "AbAbcdvAb";
        Assert.assertEquals(expectedStr, Front22.front22_1(inputStr));
    }
}

