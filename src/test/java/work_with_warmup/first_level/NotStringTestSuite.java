package work_with_warmup.first_level;

import org.junit.Assert;
import org.junit.Test;

public class NotStringTestSuite {
    @Test
    public void should_return_new_string_where_not_has_been_added_to_front() {
        String inputStr = "candy";
        String expectedStr = "not candy";
        Assert.assertEquals(expectedStr, NotString.notString(inputStr));
    }

    @Test
    public void should_return_new_string_where_not_has_been_added_to_front2() {
        String inputStr = "not candy";
        String expectedStr = "not candy";
        Assert.assertEquals(expectedStr, NotString.notString(inputStr));
    }


}
