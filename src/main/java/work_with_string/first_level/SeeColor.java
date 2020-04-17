package work_with_string.first_level;

public class SeeColor {
    static String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        }
        if (str.startsWith("blue")) {
            return "blue";
        }
        return "";

    }
}
