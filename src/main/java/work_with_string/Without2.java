package work_with_string;

public class Without2 {
    static String without2(String str) {
        if (str.isEmpty()) {
            return str;
        }
        if (str.length() == 1) {
            return str;
        }
        if (str.length() == 2) {
            return "";
        }
        if (str.length() == 3 && str.substring(0, 2).equals(str.substring(str.length() - 2))) {
            return str.substring(0, 1);
        }
        if (str.substring(0, 2).equals(str.substring(str.length() - 2))) {
            return str.substring(2);
        }
        return str;
    }
}
