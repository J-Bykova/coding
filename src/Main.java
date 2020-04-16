

public class Main {

    public static void main(String[] args) {

        System.out.println("'coding' should be 'codign': " + WorkWithString.lastTwo("coding"));
        System.out.println("----------");
        System.out.println("'cat' should be 'cta': " + WorkWithString.lastTwo("cat"));
        System.out.println("----------");
        System.out.println("'ab' should be 'ba': " + WorkWithString.lastTwo("ab"));
        System.out.println("----------");
        System.out.println("'' should be '' " + WorkWithString.lastTwo(""));
        System.out.println("----------");
        System.out.println("'a' should be 'a': " + WorkWithString.lastTwo("a"));
        System.out.println("----------");
    }
}
