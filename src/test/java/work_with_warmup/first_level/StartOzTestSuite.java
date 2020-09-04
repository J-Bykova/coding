package work_with_warmup.first_level;

import org.junit.Assert;
import org.junit.Test;

public class StartOzTestSuite {
    @Test
    public void test1(){
        Assert.assertEquals("oz", StartOz.startOz("ozymandias"));
    }

    @Test
    public void test2(){
        Assert.assertEquals("z", StartOz.startOz("bzoo"));
    }

    @Test
    public void test3(){
        Assert.assertEquals("o", StartOz.startOz("oxx"));
    }
}
