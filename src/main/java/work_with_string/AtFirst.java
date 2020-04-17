package work_with_string;

public class AtFirst {
    static String atFirst(String str) {

        int minSize = 2;
        if (str.isEmpty()) {
            return "@@";
        }
        if (str.length() < minSize) {
            return str + "@";
        }
        return str.substring(0, minSize);
    }
}
