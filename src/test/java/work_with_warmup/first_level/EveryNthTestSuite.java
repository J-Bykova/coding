package work_with_warmup.first_level;

import org.junit.Assert;
import org.junit.Test;

public class EveryNthTestSuite {
    @Test
    public void test1() {
        Assert.assertEquals("Mrce", ЕveryNth.everyNth("Miracle", 2));
    }

    @Test
    public void test2() {
        Assert.assertEquals("aceg", ЕveryNth.everyNth("abcdefg", 2));
    }

    @Test
    public void test3() {
        Assert.assertEquals("adg", ЕveryNth.everyNth("abcdefg", 3));
    }
}
