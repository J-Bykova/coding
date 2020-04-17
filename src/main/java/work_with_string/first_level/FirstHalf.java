package work_with_string.first_level;

public class FirstHalf {
    static String firstHalf(String str) {
        String firstHalfSymbols = str.substring(0, str.length() / 2);
        return firstHalfSymbols;
    }
}
