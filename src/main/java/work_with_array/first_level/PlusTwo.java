package work_with_array.first_level;

public class PlusTwo {
    static int[] plusTwo(int[] a, int[] b) {
        int[] resultArr = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            resultArr[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            resultArr[i + a.length] = b[i];
        }
        return resultArr;
    }
}
