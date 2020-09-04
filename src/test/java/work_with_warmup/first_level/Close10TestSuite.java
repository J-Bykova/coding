package work_with_warmup.first_level;

import org.junit.Assert;
import org.junit.Test;

public class Close10TestSuite {
    @Test
    public void test1() {
        Assert.assertEquals(8, Close10.close10(8, 13));
    }

    @Test
    public void test2() {
        Assert.assertEquals(8, Close10.close10(13, 8));
    }

    @Test
    public void test3() {
        Assert.assertEquals(0, Close10.close10(13, 7));
    }

    @Test
    public void test4() {
        Assert.assertEquals(0, Close10.close10(13, 13));
    }
}
