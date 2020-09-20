package work_with_warmup.first_level;

import org.junit.Assert;
import org.junit.Test;

public class StringETestSuite {
    @Test
    public void test() {
        Assert.assertTrue(StringE.stringE("e"));
    }

    @Test
    public void test1() {
        Assert.assertTrue(StringE.stringE("Hello"));
    }

    @Test
    public void test2() {
        Assert.assertTrue(StringE.stringE("Heell"));
    }

    @Test
    public void test3() {
        Assert.assertTrue(StringE.stringE("Heelle"));
    }

    @Test
    public void test4() {
        Assert.assertFalse(StringE.stringE("Heelele"));
    }

    @Test
    public void test5() {
        Assert.assertFalse(StringE.stringE("Hll"));
    }

    @Test
    public void test6() {
        Assert.assertFalse(StringE.stringE(""));
    }

}
