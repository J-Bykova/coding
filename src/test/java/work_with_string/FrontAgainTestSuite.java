package work_with_string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrontAgainTestSuite {
    @Test
    public void edited_should_be_true() {
        assertEquals(true, FrontAgain.frontAgain("edited"));
    }

    @Test
    public void edit_should_be_false() {
        assertEquals(false, FrontAgain.frontAgain("edit"));
    }

    @Test
    public void ed_should_be_true() {
        assertEquals(true, FrontAgain.frontAgain("ed"));
    }

    @Test
    public void jjj_should_be_true() {
        assertEquals(true, FrontAgain.frontAgain("jjj"));
    }

    @Test
    public void empty_string_should_be_false() {
        assertEquals(false, FrontAgain.frontAgain(""));
    }
}

