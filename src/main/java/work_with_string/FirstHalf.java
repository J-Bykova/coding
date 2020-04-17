package work_with_string;

public class FirstHalf {
    static String firstHalf(String str) {
        String firstHalfSymbols = str.substring(0, str.length() / 2);
        return firstHalfSymbols;
    }
}
