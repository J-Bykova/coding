package work_with_array;

public class CommonEnd {

    static boolean commonEnd(int[] a, int[] b) {
        if (a.length == 0 || b.length == 0) {
            return false;
        }
        if (a[0] == b[0]){
            return true;
        }
        if (a[a.length - 1] == b[b.length - 1]) {
            return true;
        }
        return false;
    }

}
