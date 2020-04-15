

public class Main {

    public static void main(String[] args) {

        System.out.println("bad should be true: " + WorkWithString.hasBad("bad"));
        System.out.println("----------");
        System.out.println("badxx should be true: " + WorkWithString.hasBad("badxx"));
        System.out.println("----------");
        System.out.println("cbadxx should be true: " + WorkWithString.hasBad("cbadxx"));
        System.out.println("----------");
        System.out.println("' ' should be false: " + WorkWithString.hasBad(""));
        System.out.println("----------");
        System.out.println("ba should be false: " + WorkWithString.hasBad("ba"));
        System.out.println("----------");
        System.out.println("xba should be false: " + WorkWithString.hasBad("xba"));
        System.out.println("----------");


    }
}
