package work_with_warmup.first_level;

public class Diff21 {
    static int diff21(int n) {
        if (n <= 21) {
            int result = 21 - n;
            return result;
        }
        int result = n - 21;
        return result * 2;
    }
}
