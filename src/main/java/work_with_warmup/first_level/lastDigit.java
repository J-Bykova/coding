package work_with_warmup.first_level;

public class lastDigit {
    static final boolean lastDigit(int a, int b) {

        int remainderA = a % 10;
        int remainderB = b % 10;

        return remainderA == remainderB;
    }
}
