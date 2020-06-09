package work_with_string.second_level;

public class DoubleChar {
    static String doubleChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            String item = str.substring(i, i + 1);
            result = result + item + item;
        }
        return result;
    }
}
