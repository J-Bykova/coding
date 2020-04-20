package work_with_logic.first_level;

public class NearTen {
    static boolean nearTen(int num) {
        int rest = num % 10;

        return rest <= 2 || rest >= 8;
    }
}
