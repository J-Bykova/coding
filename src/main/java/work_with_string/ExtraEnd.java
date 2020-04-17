package work_with_string;

public class ExtraEnd {
    static String extraEnd(String str) {
        String endSymbols = str.substring(str.length() - 2);
        String newString = endSymbols + endSymbols + endSymbols;
        return newString;
    }
}
