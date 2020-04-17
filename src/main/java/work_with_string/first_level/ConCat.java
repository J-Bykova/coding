package work_with_string.first_level;

public class ConCat {
    static String conCat(String a, String b) {
        if (a.isEmpty()) {
            return b;
        }
        if (b.isEmpty()) {
            return a;
        }

        String lastLetterOfA = a.substring(a.length() - 1);
        String firstLetterOfB = b.substring(0, 1);

        if (lastLetterOfA.equals(firstLetterOfB)) {
            return a + b.substring(1);
        }

        return a + b;
    }
}
