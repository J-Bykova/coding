package work_with_warmup.first_level;

public class ParrotTrouble {
    static boolean parrotTrouble(boolean talking, int hour) {
        if (talking) {
            if (hour < 7 || hour > 20) {
                return true;
            }
            return false;
        }

        return false;
    }

}
