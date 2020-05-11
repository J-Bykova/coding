package work_with_warmup.first_level;

public class BackAround {
    static String backAround(String str) {
        if (str.length() == 0) {
            return str;
        }
        String lastElement = str.substring(str.length()-1);
        return lastElement + str + lastElement;
    }
}
