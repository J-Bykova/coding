package work_with_string.first_level;

public class ComboString {
    static String comboString(String a, String b) {
        if (a.length() > b.length()) {
            return b + a + b;
        }
        return a + b + a;
    }
}
