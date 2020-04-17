package work_with_string.first_level;

public class FrontAgain {
    static boolean frontAgain(String str) {
        if (str.isEmpty()) {
            return false;
        }
        if (str.length() == 1) {
            return false;
        }
        if (str.length() == 2) {
            return true;
        }
        String firstLetterOfStr = str.substring(0, 2);
        String lastLetterOfStr = str.substring(str.length() - 2);

        if (firstLetterOfStr.equals(lastLetterOfStr)) {
            return true;
        }
        return false;
    }
}
