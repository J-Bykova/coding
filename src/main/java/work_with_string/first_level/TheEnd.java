package work_with_string.first_level;

public class TheEnd {
    static String theEnd(String str, boolean front) {
        if (front == true) {
            return str.substring(0, 1);
        }
        return str.substring(str.length() - 1);
    }
}
