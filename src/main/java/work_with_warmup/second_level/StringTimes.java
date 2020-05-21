package work_with_warmup.second_level;

public class StringTimes {
    static String stringTimes(String str, int n) {
        String newStr = "";
        for (int i = 0; i < n; i++) {
            newStr += str;
        }
        return newStr;
    }
}
