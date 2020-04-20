package work_with_logic.first_level;

public class Love6 {
    static boolean love6(int a, int b) {
        if (a == 6 || b == 6) {
            return true;
        }
        if (a + b == 6) {
            return true;
        }
        if (a - b == 6) {
            return true;
        }
        if (b - a == 6) {
            return true;
        }
        return false;
    }
}
