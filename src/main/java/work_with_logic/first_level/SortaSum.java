package work_with_logic.first_level;

public class SortaSum {
    static int sortaSum(int a, int b) {
        if (sum(a, b) >= 10 && sum(a, b) <= 19) {
            return 20;
        }
        return sum(a, b);
    }

    static int sum(int a, int b) {
        return a + b;
    }
}
