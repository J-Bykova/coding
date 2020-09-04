package work_with_warmup.first_level;

import org.junit.Assert;
import org.junit.Test;

public class IntMaxTestSuite {
    @Test
    public void test1(){
        Assert.assertEquals(3, IntMax.intMax(1, 2, 3));
    }

    @Test
    public void test2(){
        Assert.assertEquals(3, IntMax.intMax(2, 3, 1));
    }

    @Test
    public void test3(){
        Assert.assertEquals(3, IntMax.intMax(3, 1, 2));
    }
}
