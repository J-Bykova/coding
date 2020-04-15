public class WorkWithString {


    public static String lastChars(String a, String b) {
        if (a.isEmpty() && b.isEmpty()) {
            return "@@";
        }
        if (a.isEmpty()) {
            return "@" + b.substring(b.length() - 1);
        }
        if (b.isEmpty()) {
            return a.substring(0, 1) + "@";
        }

        return a.substring(0, 1) + b.substring(b.length() - 1);
    }

    public static String atFirst(String str) {

        int minSize = 2;
        if (str.isEmpty()) {
            return "@@";
        }
        if (str.length() < minSize) {
            return str + "@";
        }
        return str.substring(0, minSize);
    }

    public static boolean hasBad(String str) {
        String bad = "bad";
        if (str.length() < bad.length()) {
            return false;
        }
        if (str.length() == bad.length()) {
            return str.equals(bad);
        }

        if (str.substring(0, 3).equals(bad)) {
            return true;
        }
        if (str.substring(1, 4).equals(bad)) {
            return true;
        }
        return false;

    }

    public static String middleThree(String str) {
        if (str.length() <= 3) {
            return str;
        }
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
    }

    public static String twoChar(String str, int index) {
        if (index > 0 && index <= str.length() - 2) {
            return str.substring(index, index + 2);
        }
        return str.substring(0, 2);
    }

    public static String nTwice(String str, int n) {
        String firstN = str.substring(0, n);
        String lastN = str.substring(str.length() - n);
        String result = firstN + lastN;
        return result;
    }

    public static boolean endsLy(String str) {
        if (str.length() >= 2) {
            String expected = "ly";
            String actual = str.substring(str.length() - 2);
            return expected.equals(actual);
        }
        return false;
    }

    public static String middleTwo(String str) {
        String newStartStr = str.substring(0, str.length() / 2);
        String lastStr = newStartStr.substring(newStartStr.length() - 1);

        String newEndStr = str.substring(str.length() / 2);
        String firstStr = newEndStr.substring(0, 1);

        return lastStr + firstStr;
    }

    public static String withoutEnd22(String str) {
        if (str.length() <= 2) {
            return "";
        }
        return str.substring(1, str.length() - 1);
    }

    public static String withoutEnd2(String str) {
        if (str.length() == 1 || str.length() == 2 || str.isEmpty()) {
            return "";
        } else {
            String without = str.substring(1, str.length() - 1);
            return without;
        }

    }

    public static String theEnd(String str, boolean front) {
        if (front == true) {
            return str.substring(0, 1);
        }
        return str.substring(str.length() - 1);
    }

    public static String right2(String str) {
        String startStr = str.substring(0, str.length() - 2);
        String endStr = str.substring(str.length() - 2);
        return endStr + startStr;
    }

    public static String left2(String str) {
        String startStr = str.substring(0, 2);
        String endStr = str.substring(2, str.length());
        return endStr + startStr;
    }

    public static String nonStart(String a, String b) {
        String newA = a.substring(1, a.length());
        String newB = b.substring(1, b.length());
        return newA + newB;
    }

    public static String comboString(String a, String b) {
        if (a.length() > b.length()) {
            return b + a + b;
        }
        return a + b + a;
    }

    public static String withoutEnd(String str) {
        String newStr = str.substring(1, str.length() - 1);
        return newStr;
    }

    public static String firstHalf(String str) {
        String firstHalfSymbols = str.substring(0, str.length() / 2);
        return firstHalfSymbols;
    }

    public static String firstTwo(String str) {
        if (str.isEmpty()) {
            return str;
        }
        if (str.length() < 2) {
            return str;
        }
        if (!(str.length() == 2)) {
            String firstTwoSymbols = str.substring(0, 2);
            return firstTwoSymbols;
        }
        return str;
    }

    public static String firstTwo2(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        } else {
            return str;
        }
    }

    public static String populateTemplate(String out, String word) {
        return out.substring(0, out.length() / 2) + word + out.substring(out.length() / 2);
    }

    public static String populateTemplate2(String template, String data) {
        String leftHalfOfTheTemplate = template.substring(0, template.length() / 2);
        String rightHalfOfTheTemplate = template.substring(template.length() / 2);
        return leftHalfOfTheTemplate + data + rightHalfOfTheTemplate;
    }

    public static String extraEnd(String str) {
        String endSymbols = str.substring(str.length() - 2);
        String newString = endSymbols + endSymbols + endSymbols;
        return newString;
    }


}
