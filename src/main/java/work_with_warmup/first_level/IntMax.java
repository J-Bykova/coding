package work_with_warmup.first_level;

public class IntMax {
    static int intMax(int a, int b, int c) {
        int maxResult;

        if (a > b){
            maxResult = a;
        }
        else
            maxResult = b;

        if (c > maxResult){
            return c;
        }


        return maxResult;
    }
}
