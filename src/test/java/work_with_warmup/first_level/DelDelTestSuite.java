package work_with_warmup.first_level;

import org.junit.Assert;
import org.junit.Test;

public class DelDelTestSuite {

    @Test
    public void test1() {
        Assert.assertEquals("abc", DelDel.delDel("adelbc"));
    }

    @Test
    public void test2() {
        Assert.assertEquals("aHello", DelDel.delDel("adelHello"));
    }

    @Test
    public void test3() {
        Assert.assertEquals("adedbc", DelDel.delDel("adedbc"));
    }
}
