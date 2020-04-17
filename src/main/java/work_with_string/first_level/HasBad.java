package work_with_string.first_level;

public class HasBad {
    static boolean hasBad(String str) {
        String bad = "bad";
        if (str.length() < bad.length()) {
            return false;
        }
        if (str.length() == bad.length()) {
            return str.equals(bad);
        }

        if (str.substring(0, 3).equals(bad)) {
            return true;
        }
        if (str.substring(1, 4).equals(bad)) {
            return true;
        }
        return false;

    }
}
