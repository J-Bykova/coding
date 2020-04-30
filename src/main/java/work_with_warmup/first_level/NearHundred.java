package work_with_warmup.first_level;

public class NearHundred {
//    static boolean nearHundred(int n) {
//        if ((n >= 90 && n <= 110) || (n >= 190 && n <= 210)) {
//            return true;
//        }
//        return false;
//    }

    static boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) ||
                (Math.abs(200 - n) <= 10));
    }
}
