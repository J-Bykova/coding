package work_with_warmup.first_level;

import org.junit.Assert;
import org.junit.Test;

public class Front3TestSuite {
    @Test
    public void if_str_has_length_3_should_return_string_which_is_3_copies_of_front() {
        String inputStr = "abc";
        String expectedStr = "abcabcabc";
        Assert.assertEquals(expectedStr, Front3.front3(inputStr));
    }

    @Test
    public void if_str_has_length_4_should_return_string_which_is_3_copies_of_front() {
        String inputStr = "Java";
        String expectedStr = "JavJavJav";
        Assert.assertEquals(expectedStr, Front3.front3(inputStr));
    }

    @Test
    public void if_str_has_length_7_should_return_string_which_is_3_copies_of_front() {
        String inputStr = "Chocolate";
        String expectedStr = "ChoChoCho";
        Assert.assertEquals(expectedStr, Front3.front3(inputStr));
    }
}
