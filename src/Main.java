

public class Main {

    public static void main(String[] args) {

        System.out.println("'edited' should be 'true': " + WorkWithString.frontAgain("edited"));
        System.out.println("----------");
        System.out.println("'edit' should be 'false': " + WorkWithString.frontAgain("edit"));
        System.out.println("----------");
        System.out.println("'ed' should be 'true': " + WorkWithString.frontAgain("ed"));
        System.out.println("----------");
        System.out.println("'jjj' should be 'true' " + WorkWithString.frontAgain("jjj"));
        System.out.println("----------");
        System.out.println("'' should be 'false': " + WorkWithString.frontAgain(""));
        System.out.println("----------");

    }
}
