package work_with_warmup.first_level;

public class PosNeg {
    static boolean posNeg(int a, int b, boolean negative) {
        if (a < 0 && b < 0) {
            if (negative) {
                return true;
            }
            return false;
        }
        if (a < 0 || b < 0) {
            if (negative) {
                return false;
            }
            return true;
        }
        return false;
    }
}
