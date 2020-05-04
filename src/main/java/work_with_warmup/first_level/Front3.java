package work_with_warmup.first_level;

public class Front3 {
    static String front3(String str) {
        if (str.length() <= 3) {
            return str + str + str;
        }
        String first_3_chars_of_str = str.substring(0, 3);
        return first_3_chars_of_str + first_3_chars_of_str + first_3_chars_of_str;
    }
}
