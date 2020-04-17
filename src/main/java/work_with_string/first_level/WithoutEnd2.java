package work_with_string.first_level;

public class WithoutEnd2 {
    static String withoutEnd2(String str) {
        if (str.length() == 1 || str.length() == 2 || str.isEmpty()) {
            return "";
        } else {
            String without = str.substring(1, str.length() - 1);
            return without;
        }

    }
}
