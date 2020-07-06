package work_with_warmup.second_level;

public class StringMatch {
    static int stringMatch(String firstStr, String secondStr) {

        int counter = 0;
        int len = Math.min(firstStr.length(), secondStr.length());

        for (int i = 0; i < len - 1; i++) {
            String firstSub = firstStr.substring(i, i + 2);
            String secondSub = secondStr.substring(i, i + 2);
            if (firstSub.equals(secondSub)) {
                counter++;
            }
        }
        return counter;
    }
}
