package work_with_string.first_level;

public class EndsLy {
    static boolean endsLy(String str) {
        if (str.length() >= 2) {
            String expected = "ly";
            String actual = str.substring(str.length() - 2);
            return expected.equals(actual);
        }
        return false;
    }
}
