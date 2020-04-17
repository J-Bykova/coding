package work_with_string.first_level;

public class LastTwo {
    static String lastTwo(String str) {
        if (str.isEmpty()) {
            return str;
        }
        if (str.length() < 2) {
            return str;
        }
        String lastLetter = str.substring(str.length() - 1);
        String secondToLastLetter = str.substring(str.length() - 2, str.length() - 1);
        if (str.length() == 2) {
            return lastLetter + secondToLastLetter;
        }
        return str.substring(0, str.length() - 2) + lastLetter + secondToLastLetter;
    }
}
