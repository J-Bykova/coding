package work_with_logic.first_level;

import org.junit.Assert;
import org.junit.Test;

public class SortaSumTestSuite {
    @Test
    public void test1() {
        Assert.assertEquals(7, SortaSum.sortaSum(3, 4));
    }

    @Test
    public void test2() {
        Assert.assertEquals(20, SortaSum.sortaSum(9, 4));
    }

    @Test
    public void test3() {
        Assert.assertEquals(21, SortaSum.sortaSum(10, 11));
    }
}
