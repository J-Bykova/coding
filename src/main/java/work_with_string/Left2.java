package work_with_string;

public class Left2 {
    static String left2(String str) {
        String startStr = str.substring(0, 2);
        String endStr = str.substring(2, str.length());
        return endStr + startStr;
    }
}
