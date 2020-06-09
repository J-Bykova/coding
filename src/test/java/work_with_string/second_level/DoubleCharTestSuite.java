package work_with_string.second_level;

import org.junit.Assert;
import org.junit.Test;

public class DoubleCharTestSuite {
    @Test
    public void test1() {
        Assert.assertEquals("TThhee", DoubleChar.doubleChar("The"));
    }

    @Test
    public void test2() {
        Assert.assertEquals("AAAAbbbb", DoubleChar.doubleChar("AAbb"));
    }

    @Test
    public void test3() {
        Assert.assertEquals("HHii--TThheerree", DoubleChar.doubleChar("Hi-There"));
    }
}
