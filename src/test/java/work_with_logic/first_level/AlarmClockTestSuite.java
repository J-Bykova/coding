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
    public void should_return_alarmInWeekdays_if_it_is_monday_and_not_vacation() {
        Assert.assertEquals(alarmInWeekdays, AlarmClock.alarmClock(monday, iAmNotOnVacation));
    }

    @Test
    public void should_return_alarmInWeekdays_if_it_is_tuesday_and_not_vacation() {
        Assert.assertEquals(alarmInWeekdays, AlarmClock.alarmClock(tuesday, iAmNotOnVacation));
    }

    @Test
    public void should_return_alarmInWeekdays_if_it_is_wednesday_and_not_vacation() {
        Assert.assertEquals(alarmInWeekdays, AlarmClock.alarmClock(wednesday, iAmNotOnVacation));
    }

    @Test
    public void should_return_alarmInWeekdays_if_it_is_thursday_and_not_vacation() {
        Assert.assertEquals(alarmInWeekdays, AlarmClock.alarmClock(thursday, iAmNotOnVacation));
    }

    @Test
    public void should_return_alarmInWeekdays_if_it_is_friday_and_not_vacation() {
        Assert.assertEquals(alarmInWeekdays, AlarmClock.alarmClock(friday, iAmNotOnVacation));
    }

    //без каникул на выходных
    @Test
    public void should_return_alarmInWeekend_if_it_is_saturday_and_not_vacation() {
        Assert.assertEquals(alarmInWeekend, AlarmClock.alarmClock(saturday, iAmNotOnVacation));
    }

    @Test
    public void should_return_alarmInWeekend_if_it_is_sunday_and_not_vacation() {
        Assert.assertEquals(alarmInWeekend, AlarmClock.alarmClock(sunday, iAmNotOnVacation));
    }

    //на каникулах на буднях
    @Test
    public void should_return_alarmInWeekend_if_it_is_monday_and_vacation() {
        Assert.assertEquals(alarmInWeekend, AlarmClock.alarmClock(monday, iAmOnVacation));
    }

    @Test
    public void should_return_alarmInWeekend_if_it_is_tuesday_and_vacation() {
        Assert.assertEquals(alarmInWeekend, AlarmClock.alarmClock(tuesday, iAmOnVacation));
    }

    @Test
    public void should_return_alarmInWeekend_if_it_is_wednesday_and_vacation() {
        Assert.assertEquals(alarmInWeekend, AlarmClock.alarmClock(wednesday, iAmOnVacation));
    }

    @Test
    public void should_return_alarmInWeekend_if_it_is_thursday_and_vacation() {
        Assert.assertEquals(alarmInWeekend, AlarmClock.alarmClock(thursday, iAmOnVacation));
    }

    @Test
    public void should_return_alarmInWeekend_if_it_is_friday_and_vacation() {
        Assert.assertEquals(alarmInWeekend, AlarmClock.alarmClock(friday, iAmOnVacation));
    }

    //на каникулах на выходных
    @Test
    public void should_return_alarmOff_if_it_is_sunday_and_vacation() {
        Assert.assertEquals(alarmOff, AlarmClock.alarmClock(sunday, iAmOnVacation));
    }

    @Test
    public void should_return_alarmOff_if_it_is_saturday_and_vacation() {
        Assert.assertEquals(alarmOff, AlarmClock.alarmClock(saturday, iAmOnVacation));
    }

}
