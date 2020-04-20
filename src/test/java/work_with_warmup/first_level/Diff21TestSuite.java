package work_with_warmup.first_level;

import org.junit.Assert;
import org.junit.Test;

public class Diff21TestSuite {
    @Test
    public void test1() {
        Assert.assertEquals(2, Diff21.diff21(19));
    }

    @Test
    public void test2() {
        Assert.assertEquals(11, Diff21.diff21(10));
    }

    @Test
    public void test3() {
        Assert.assertEquals(0, Diff21.diff21(21));
    }

    @Test
    public void test4() {
        Assert.assertEquals(2, Diff21.diff21(22));
    }
}
