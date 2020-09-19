package work_with_warmup.first_level;

public class Max1020 {
    static final int max1020(int a, int b) {
        if (a >= 10 && a <= 20 && b >= 10 && b <= 20) {
            if (a > b) {
                return a;
            }
            if (a < b) {
                return b;
            }
        }


        return 0;
    }
}
