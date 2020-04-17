package work_with_string.first_level;

public class MiddleThree {
    static String middleThree(String str) {
        if (str.length() <= 3) {
            return str;
        }
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
    }
}
