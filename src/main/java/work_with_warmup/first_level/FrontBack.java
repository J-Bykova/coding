package work_with_warmup.first_level;

public class FrontBack {
    static String frontBack(String str) {
        if (str.length() <= 1) {
            return str;
        }
        String midStr = str.substring(1, str.length()-1);
        return str.charAt(str.length()-1) + midStr + str.charAt(0);
    }
}
