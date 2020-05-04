package work_with_warmup.first_level;

import org.junit.Assert;
import org.junit.Test;

public class MissingCharTestSuite {
    @Test
    public void should_return_new_string_where_char_at_index_0_has_been_removed() {
        String inputStr = "kitten";
        int inputIndex = 0;
        String expectedStr = "itten";
        Assert.assertEquals(expectedStr, MissingChar.missingChar(inputStr, inputIndex));
    }

    @Test
    public void should_return_new_string_where_char_at_index_1_has_been_removed() {
        String inputStr = "kitten";
        int inputIndex = 1;
        String expectedStr = "ktten";
        Assert.assertEquals(expectedStr, MissingChar.missingChar(inputStr, inputIndex));
    }

    @Test
    public void should_return_new_string_where_char_on_last_index_has_been_removed() {
        String inputStr = "kitten";
        int inputIndex = 5;
        String expectedStr = "kitte";
        Assert.assertEquals(expectedStr, MissingChar.missingChar(inputStr, inputIndex));
    }
}
