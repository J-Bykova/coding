package work_with_warmup.first_level;

import org.junit.Assert;
import org.junit.Test;

public class MixStartTestSuite {
    @Test
    public void test1(){
        Assert.assertTrue(MixStart.mixStart("mix snacks"));
    }

    @Test
    public void test2(){
        Assert.assertTrue(MixStart.mixStart("pix snacks"));
    }

    @Test
    public void test3(){
        Assert.assertFalse(MixStart.mixStart("piz snacks"));
    }

}
