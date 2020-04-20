package work_with_logic.first_level;

public class AlarmClock {
    static String alarmClock(int day, boolean vacation) {
        if (vacation) {
            if (day == 0 || day == 6) {
                return "off";
            }
            return "10:00";
        }
        if (!vacation) {
            if (day == 0 || day == 6) {
                return "10:00";
            }
            return "7:00";
        }
        return "что то пошло не так!";
    }
}
