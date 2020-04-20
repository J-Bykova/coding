package work_with_logic.first_level;

public class Old35 {
    static boolean old35(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return false;
        }
        if (n % 3 == 0 || n % 5 == 0) {
            return true;
        }
        return false;
    }
}
