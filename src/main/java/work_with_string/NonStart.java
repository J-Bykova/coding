package work_with_string;

public class NonStart {
    static String nonStart(String a, String b) {
        String newA = a.substring(1, a.length());
        String newB = b.substring(1, b.length());
        return newA + newB;
    }
}
