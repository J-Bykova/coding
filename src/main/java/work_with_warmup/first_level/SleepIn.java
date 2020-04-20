package work_with_warmup.first_level;

public class SleepIn {
    static boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday && vacation) {
            return true;
        }
        if (!weekday && !vacation) {
            return true;
        }
        if (!weekday && vacation) {
            return true;
        }
        return false;
    }
}
