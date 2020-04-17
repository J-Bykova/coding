package work_with_string.first_level;

public class ExtraFront {
    static String extraFront(String str) {
        if (str.isEmpty()) {
            return str;
        }
        if (str.length() == 1) {
            return str + str + str;
        }
        if (str.length() == 2) {
            return str + str + str;
        }
        return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
    }
}
