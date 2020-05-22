package work_with_warmup.second_level;

public class FrontTimes {
    static String frontTimes(String str, int n) {
        String result = "";
        String front;

        if (str.length() >= 3) {
            front = str.substring(0, 3);
        } else {
            front = str;
        }

        for (int i = 0; i < n; i++) {
            result += front;
        }

        return result;
    }

}
