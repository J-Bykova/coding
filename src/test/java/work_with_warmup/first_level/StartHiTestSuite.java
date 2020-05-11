package work_with_warmup.first_level;

import org.junit.Assert;
import org.junit.Test;

public class StartHiTestSuite {
    @Test
    public void should_return_false_if_str_is_empty() {
        String input = "";
        Assert.assertFalse(StartHi.startHi(input));
    }

    @Test
    public void should_return_false_if_str_has_one_element() {
        String input = "a";
        Assert.assertFalse(StartHi.startHi(input));
    }

    @Test
    public void should_return_true_if_string_starts_with_hi_when_length_is_2() {
        String inputStr = "hi";
        Assert.assertTrue(StartHi.startHi(inputStr));
    }

    @Test
    public void should_return_true_if_string_starts_with_hi_when_str_has_2_word() {
        String inputStr = "hi there";
        Assert.assertTrue(StartHi.startHi(inputStr));
    }

    @Test
    public void should_return_false_if_string_no_starts_with_hi() {
        String inputStr = "hello";
        Assert.assertFalse(StartHi.startHi(inputStr));
    }

}
