

public class Main {

    public static void main(String[] args) {

        System.out.println("'hello' should be he: " + WorkWithString.atFirst("hello"));
        System.out.println("----------");
        System.out.println("'hi' should be hi: " + WorkWithString.atFirst("hi"));
        System.out.println("----------");
        System.out.println("'h' should be h@: " + WorkWithString.atFirst("h"));
        System.out.println("----------");
        System.out.println("' ' should be @@: " + WorkWithString.atFirst(""));
        System.out.println("----------");



    }
}
