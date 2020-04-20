package work_with_warmup.first_level;

public class Makes10 {
    static boolean makes10(int a, int b) {
        if (a == 10 || b == 10) {
            return true;
        }
        if ((a + b) == 10) {
            return true;
        }
        return false;
    }
}
