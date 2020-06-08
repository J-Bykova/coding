package work_with_warmup.first_level;

public class IcyHot {
    static boolean icyHot(int num1, int num2) {
        if ((num1 < 0 && num2 > 100) || (num1 > 100 && num2 < 0)) {
            return true;
        } else {
            return false;
        }
    }
}
