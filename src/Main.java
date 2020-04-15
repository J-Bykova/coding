

public class Main {

    public static void main(String[] args) {

        System.out.println("'abc', 'cat' should be 'abcat': " + WorkWithString.conCat("abc", "cat"));
        System.out.println("----------");
        System.out.println("'dog', 'cat' should be 'dogcat': " + WorkWithString.conCat("dog", "cat"));
        System.out.println("----------");
        System.out.println("'abc', '' should be 'abc': " + WorkWithString.conCat("abc", ""));
        System.out.println("----------");
        System.out.println("'', '' should be '': " + WorkWithString.conCat("", ""));
        System.out.println("----------");
    }
}
