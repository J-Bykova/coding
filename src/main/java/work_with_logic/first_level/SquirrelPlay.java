package work_with_logic.first_level;

public class SquirrelPlay {
    static boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer) {
            return temp >= 60 && temp <= 100;
        }
        if (!isSummer) {
            return temp >= 60 && temp <= 90;
        }
        return false;
    }
}
