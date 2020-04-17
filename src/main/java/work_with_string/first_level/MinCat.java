package work_with_string.first_level;

public class MinCat {
    static String minCat(String a, String b) {
        if (a.isEmpty() || b.isEmpty()) {
            return "";
        }
        if (a.length() == b.length()) {
            return a + b;
        }
        if (a.length() < b.length()) {
            return a + b.substring(b.length() - a.length());
        }
        return a.substring(a.length() - b.length()) + b;
    }
}
