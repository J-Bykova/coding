package work_with_string;

public class LastChars {
    public static String lastChars(String a, String b) {
        if (a.isEmpty() && b.isEmpty()) {
            return "@@";
        }
        if (a.isEmpty()) {
            return "@" + b.substring(b.length() - 1);
        }
        if (b.isEmpty()) {
            return a.substring(0, 1) + "@";
        }

        return a.substring(0, 1) + b.substring(b.length() - 1);
    }
}
