package work_with_string;

public class FirstTwo {
    static String firstTwo(String str) {
        if (str.isEmpty()) {
            return str;
        }
        if (str.length() < 2) {
            return str;
        }
        if (!(str.length() == 2)) {
            String firstTwoSymbols = str.substring(0, 2);
            return firstTwoSymbols;
        }
        return str;
    }
}
