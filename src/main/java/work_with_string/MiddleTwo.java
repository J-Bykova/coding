package work_with_string;

public class MiddleTwo {
    static String middleTwo(String str) {
        String newStartStr = str.substring(0, str.length() / 2);
        String lastStr = newStartStr.substring(newStartStr.length() - 1);

        String newEndStr = str.substring(str.length() / 2);
        String firstStr = newEndStr.substring(0, 1);

        return lastStr + firstStr;
    }
}
