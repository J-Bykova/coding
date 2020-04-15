

public class Main {

    public static void main(String[] args) {

        System.out.println("\"last\", \"chars\" should be ls: " + WorkWithString.lastChars("last", "chars"));
        System.out.println("----------");
        System.out.println("\"yo\", \"java\" should be ya: " + WorkWithString.lastChars("yo", "java"));
        System.out.println("----------");
        System.out.println("\"h\", \"\" should be h@: " + WorkWithString.lastChars("h", ""));
        System.out.println("----------");
        System.out.println("\"\", \"\" should be @@: " + WorkWithString.lastChars("", ""));
        System.out.println("----------");

    }
}
