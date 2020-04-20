package work_with_logic.first_level;

import org.junit.Assert;
import org.junit.Test;

public class TeaPartyTestSuite {
    @Test
    public void test1() {
        Assert.assertEquals(1, TeaParty.teaParty(6, 8));
    }

    @Test
    public void test2() {
        Assert.assertEquals(0, TeaParty.teaParty(3, 8));
    }

    @Test
    public void test3() {
        Assert.assertEquals(2, TeaParty.teaParty(20, 6));
    }

    @Test
    public void test4() {
        Assert.assertEquals(2, TeaParty.teaParty(12, 6));
    }
}
