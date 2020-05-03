package work_with_array.first_level;

public class BiggerTwo {
    static int[] biggerTwo(int[] a, int[] b) {
        int sumOfArrayA = 0;
        for (int i = 0; i < a.length; i++) {
            sumOfArrayA += a[i];
        }

        int sumOfArrayB = 0;
        for (int i = 0; i < a.length; i++) {
            sumOfArrayB += b[i];
        }

        if (sumOfArrayA == sumOfArrayB || sumOfArrayA > sumOfArrayB) {
            return a;
        }
        return b;
    }
}
