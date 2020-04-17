package work_with_string;

public class Right2 {
    static String right2(String str) {
        String startStr = str.substring(0, str.length() - 2);
        String endStr = str.substring(str.length() - 2);
        return endStr + startStr;
    }
}
