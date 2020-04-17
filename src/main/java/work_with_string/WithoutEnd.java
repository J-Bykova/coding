package work_with_string;

public class WithoutEnd {
    static String withoutEnd(String str) {
        String newStr = str.substring(1, str.length() - 1);
        return newStr;
    }
}
