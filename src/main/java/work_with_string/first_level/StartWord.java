package work_with_string.first_level;

public class StartWord {
    static String startWord(String str, String word) {
        if (str.length() - word.length() < 0) {
            return "";
        }

        String a = str.substring(1, word.length());
        String b = word.substring(1, word.length());

        if (a.equals(b)) {
            return str.substring(0, word.length());
        }

        return "";
    }
}
