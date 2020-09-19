package work_with_warmup.first_level;

public class StringE {
    static final boolean stringE(String str) {

        String strE = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals("e")) {
                strE = str.
                        substring(i, i + 1);
            }
        }

        if (strE.length() >= 1 && strE.length() <= 3) {
            return true;
        }

        return false;
    }
}
