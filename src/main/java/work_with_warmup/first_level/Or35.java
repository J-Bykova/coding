package work_with_warmup.first_level;

public class Or35 {
    static boolean or35(int n) {
        if (n > 0) {
            if (n % 3 == 0 || n % 5 == 0) {
                return true;
            }
        }
        return false;
    }
}
