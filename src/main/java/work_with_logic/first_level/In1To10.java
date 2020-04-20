package work_with_logic.first_level;

public class In1To10 {
    static boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode) {
            return n <= 1 || n >= 10;
        }
        if (!outsideMode) {
            return n >= 1 && n <= 10;
        }
        return false;
    }
}
