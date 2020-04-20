package work_with_logic.first_level;

public class SpecialEleven {
    static boolean specialEleven(int n) {
        if (n % 11 == 0) {
            return true;
        }
        if ((n - 1) % 11 == 0) {
            return true;
        }
        return false;
    }
}
