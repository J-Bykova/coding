package work_with_logic.first_level;

import org.junit.Assert;
import org.junit.Test;

public class CigarPartyTestSuite {

    @Test
    public void test1() {
        int numberOfCigars = 30;
        Assert.assertFalse(CigarParty.cigarParty(numberOfCigars, false));
    }

    @Test
    public void test2() {
        int numberOfCigars = 50;
        Assert.assertTrue(CigarParty.cigarParty(numberOfCigars, false));
    }

    @Test
    public void test3() {
        int numberOfCigars = 70;
        Assert.assertTrue(CigarParty.cigarParty(numberOfCigars, true));
    }

    @Test
    public void test4() {
        int numberOfCigars = 30;
        Assert.assertFalse(CigarParty.cigarParty(numberOfCigars, true));
    }

    @Test
    public void test5() {
        int numberOfCigars = 50;
        Assert.assertTrue(CigarParty.cigarParty(numberOfCigars, true));
    }

    @Test
    public void test6() {
        int numberOfCigars = 60;
        Assert.assertTrue(CigarParty.cigarParty(numberOfCigars, false));
    }

    @Test
    public void test7() {
        int numberOfCigars = 61;
        Assert.assertFalse(CigarParty.cigarParty(numberOfCigars, false));
    }

    @Test
    public void test8() {
        int numberOfCigars = 40;
        Assert.assertTrue(CigarParty.cigarParty(numberOfCigars, false));
    }

    @Test
    public void test9() {
        int numberOfCigars = 39;
        Assert.assertFalse(CigarParty.cigarParty(numberOfCigars, false));
    }

    @Test
    public void test10() {
        int numberOfCigars = 40;
        Assert.assertTrue(CigarParty.cigarParty(numberOfCigars, true));
    }

    @Test
    public void test11() {
        int numberOfCigars = 39;
        Assert.assertFalse(CigarParty.cigarParty(numberOfCigars, true));
    }
}
