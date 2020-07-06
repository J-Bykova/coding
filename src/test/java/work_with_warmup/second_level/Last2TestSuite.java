package work_with_warmup.second_level;

import org.junit.Assert;
import org.junit.Test;

public class Last2TestSuite {
    @Test
    public void test() {
        Assert.assertEquals(1, Last2.last2("hixxhi"));
    }

    @Test
    public void test2() {
        Assert.assertEquals(1, Last2.last2("xaxxaxaxx"));
    }

    @Test
    public void test3() {
        Assert.assertEquals(2, Last2.last2("axxxaaxx"));
    }

    @Test
    public void test4() {
        Assert.assertEquals(0, Last2.last2(""));
    }

    @Test
    public void test5() {
        Assert.assertEquals(0, Last2.last2("hi"));
    }

    @Test
    public void test6() {
        Assert.assertEquals(0, Last2.last2("h"));
    }

}
