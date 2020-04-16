

public class Main {

    public static void main(String[] args) {

        System.out.println("'redxx' should be 'red': " + WorkWithString.seeColor("redxx"));
        System.out.println("----------");
        System.out.println("'xxred' should be '': " + WorkWithString.seeColor("xxred"));
        System.out.println("----------");
        System.out.println("'blueTimes' should be 'blue': " + WorkWithString.seeColor("blueTimes"));
        System.out.println("----------");
        System.out.println("'' should be '' " + WorkWithString.seeColor(""));
        System.out.println("----------");

    }
}
