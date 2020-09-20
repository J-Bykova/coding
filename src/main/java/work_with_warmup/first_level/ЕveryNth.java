package work_with_warmup.first_level;

public class ЕveryNth {
    static final String everyNth(String str, int n) {
        String result = "";

        for (int i = 0; i < str.length(); i += n) {
            result += str.charAt(i);
        }

        return result;
    }

}
