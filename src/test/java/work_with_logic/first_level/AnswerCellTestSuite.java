package work_with_logic.first_level;

import org.junit.Assert;
import org.junit.Test;

public class AnswerCellTestSuite {
    @Test
    public void test1() {
        Assert.assertTrue(AnswerCell.answerCell(false, false, false));
    }

    @Test
    public void test2() {
        Assert.assertFalse(AnswerCell.answerCell(false, false, true));
    }

    @Test
    public void test3() {
        Assert.assertFalse(AnswerCell.answerCell(true, false, false));
    }

    @Test
    public void test4() {
        Assert.assertFalse(AnswerCell.answerCell(true, true, true));
    }

    @Test
    public void test5() {
        Assert.assertTrue(AnswerCell.answerCell(false, true, false));
    }
}
