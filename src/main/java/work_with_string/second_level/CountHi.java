package work_with_string.second_level;

public class CountHi {
    static int countHi(String str, String countWord) {
        int count = 0;
        if (str.length() < countWord.length()) {
            return count;
        }
        if (str.equals(countWord)) {
            return 1;
        }
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                count++;
            }

        }
        return count;
    }
}
