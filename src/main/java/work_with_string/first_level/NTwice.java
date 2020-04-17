package work_with_string.first_level;

public class NTwice {
    static String nTwice(String str, int n) {
        String firstN = str.substring(0, n);
        String lastN = str.substring(str.length() - n);
        String result = firstN + lastN;
        return result;
    }
}
