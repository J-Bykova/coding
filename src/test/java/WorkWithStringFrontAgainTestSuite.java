import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WorkWithStringFrontAgainTestSuite {
    @Test
    public void edited_should_be_true() {
        assertEquals(true, WorkWithString.frontAgain("edited"));
    }

    @Test
    public void edit_should_be_false() {
        assertEquals(false, WorkWithString.frontAgain("edit"));
    }

    @Test
    public void ed_should_be_true() {
        assertEquals(true, WorkWithString.frontAgain("ed"));
    }

    @Test
    public void jjj_should_be_true() {
        assertEquals(true, WorkWithString.frontAgain("jjj"));
    }

    @Test
    public void empty_string_should_be_false() {
        assertEquals(false, WorkWithString.frontAgain(""));
    }
}

