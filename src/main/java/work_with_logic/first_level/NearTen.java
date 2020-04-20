package work_with_logic.first_level;

public class NearTen {
    static boolean nearTen(int num) {
        if (num % 10 <= 2 || num % 10 >= 8) {
            return true;
        }
        return false;
    }
}
