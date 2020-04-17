package work_with_string;

public class TwoChar {
    static String twoChar(String str, int index) {
        if (index > 0 && index <= str.length() - 2) {
            return str.substring(index, index + 2);
        }
        return str.substring(0, 2);
    }
}
