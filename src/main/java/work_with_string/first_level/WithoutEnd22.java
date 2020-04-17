package work_with_string.first_level;

public class WithoutEnd22 {
    static String withoutEnd22(String str) {
        if (str.length() <= 2) {
            return "";
        }
        return str.substring(1, str.length() - 1);
    }
}
