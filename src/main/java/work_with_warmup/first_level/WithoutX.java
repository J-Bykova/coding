package work_with_warmup.first_level;

public class WithoutX {
    static String withoutX(String str) {
        String pattern = "x";

        if (str.length() == 0 || str.equals(pattern)) {
            return "";
        }

        if (str.startsWith(pattern) && str.endsWith(pattern)) {
            return str.substring(1, str.length() - 1);
        }

        if (str.startsWith(pattern)) {
            return str.substring(1);
        }

        if (str.endsWith(pattern)) {
            return str.substring(0, str.length() - 1);
        }

        return str;
    }
}
