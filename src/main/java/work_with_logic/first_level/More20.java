package work_with_logic.first_level;

public class More20 {
    static boolean more20(int n) {
        if (n % 20 == 0) {
            return false;
        }
        if ((n - 1) % 20 == 0) {
            return true;
        }
        if ((n - 2) % 20 == 0) {
            return true;
        }
        return false;
    }
}
