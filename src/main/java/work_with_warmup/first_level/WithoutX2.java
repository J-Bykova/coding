package work_with_warmup.first_level;

public class WithoutX2 {
    static String withoutX2(String str) {
        String pattern = "x";

        if (str.isEmpty() || str.equals(pattern)) {
            return "";
        }

        String firstChart = str.substring(0, 1);
        String secondChart = str.substring(1, 2);

        if (firstChart.equals(pattern) && secondChart.equals(pattern)) {
            return str.substring(2);
        }
        if (firstChart.equals(pattern)) {
            return str.substring(1);
        }
        if (secondChart.equals(pattern)) {
            return str.substring(0, 1) + str.substring(2);
        }
        return str;
    }
}
