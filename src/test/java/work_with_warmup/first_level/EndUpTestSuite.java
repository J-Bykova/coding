package work_with_warmup.first_level;

import org.junit.Assert;
import org.junit.Test;

public class EndUpTestSuite {
    @Test
    public void test() {
        Assert.assertEquals("", EndUp.endUp(""));
    }

    @Test
    public void test1() {
        Assert.assertEquals("F", EndUp.endUp("f"));
    }

    @Test
    public void test2() {
        Assert.assertEquals("HI", EndUp.endUp("hi"));
    }

    @Test
    public void test3() {
        Assert.assertEquals("xyZ12", EndUp.endUp("xyz12"));
    }

    @Test
    public void test4() {
        Assert.assertEquals("hi thERE", EndUp.endUp("hi there"));
    }
}
