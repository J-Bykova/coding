package work_with_logic.first_level;

import org.junit.Assert;
import org.junit.Test;

public class AlarmClockTestSuite {
    private int sunday = 0;
    private int monday = 1;
    private int tuesday = 2;
    private int wednesday = 3;
    private int thursday = 4;
    private int friday = 5;
    private int saturday = 6;

    private boolean iAmOnVacation = true;
    private boolean iAmNotOnVacation = false;

    private String alarmInWeekdays = "7:00";
    private String alarmInWeekend = "10:00";
    private String alarmOff = "off";

    // без каникул на буднях
    @Test
    public void test1() {
        Assert.assertEquals(alarmInWeekdays, AlarmClock.alarmClock(monday, iAmNotOnVacation));
    }

    @Test
    public void test2() {
        Assert.assertEquals(alarmInWeekdays, AlarmClock.alarmClock(tuesday, iAmNotOnVacation));
    }

    @Test
    public void test3() {
        Assert.assertEquals(alarmInWeekdays, AlarmClock.alarmClock(wednesday, iAmNotOnVacation));
    }

    @Test
    public void test4() {
        Assert.assertEquals(alarmInWeekdays, AlarmClock.alarmClock(thursday, iAmNotOnVacation));
    }

    @Test
    public void test5() {
        Assert.assertEquals(alarmInWeekdays, AlarmClock.alarmClock(friday, iAmNotOnVacation));
    }

    //без каникул на выходных
    @Test
    public void test6() {
        Assert.assertEquals(alarmInWeekend, AlarmClock.alarmClock(saturday, iAmNotOnVacation));
    }

    @Test
    public void test7() {
        Assert.assertEquals(alarmInWeekend, AlarmClock.alarmClock(sunday, iAmNotOnVacation));
    }

    //на каникулах на буднях
    @Test
    public void test8() {
        Assert.assertEquals(alarmInWeekend, AlarmClock.alarmClock(monday, iAmOnVacation));
    }

    @Test
    public void test9() {
        Assert.assertEquals(alarmInWeekend, AlarmClock.alarmClock(tuesday, iAmOnVacation));
    }

    @Test
    public void test10() {
        Assert.assertEquals(alarmInWeekend, AlarmClock.alarmClock(wednesday, iAmOnVacation));
    }

    @Test
    public void test11() {
        Assert.assertEquals(alarmInWeekend, AlarmClock.alarmClock(thursday, iAmOnVacation));
    }

    @Test
    public void test12() {
        Assert.assertEquals(alarmInWeekend, AlarmClock.alarmClock(friday, iAmOnVacation));
    }

    //на каникулах на выходных
    @Test
    public void test13() {
        Assert.assertEquals(alarmOff, AlarmClock.alarmClock(sunday, iAmOnVacation));
    }

    @Test
    public void test14() {
        Assert.assertEquals(alarmOff, AlarmClock.alarmClock(saturday, iAmOnVacation));
    }

}
