package work_with_string;

public class FirstTwo2 {
    static String firstTwo2(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        } else {
            return str;
        }
    }
}
