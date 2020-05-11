package work_with_warmup.first_level;

public class Front22 {
    static String front22_1(String str) {
        if (str.length() == 0) {
            return str;
        }
        if (str.length() == 1) {
            return str + str + str;
        }
        String first2Chars = str.substring(0, 2);

        return first2Chars + str + first2Chars;
    }

    static String front22_2(String str) {
        int take = 2;
        if (take > str.length()) {
            take = str.length();
        }

        String front = str.substring(0, take);
        return front + str + front;
    }
}
