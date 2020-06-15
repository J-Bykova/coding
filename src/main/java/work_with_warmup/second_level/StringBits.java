package work_with_warmup.second_level;

public class StringBits {
    static String stringBits(String str) {
        String strOfEverySecondChar = "";
        if (str.isEmpty()) {
            return strOfEverySecondChar;
        }
        for (int i = 0; i < str.length(); i = i + 2) {
            strOfEverySecondChar = strOfEverySecondChar + str.substring(i, i + 1);
        }
        return strOfEverySecondChar;
    }
}
