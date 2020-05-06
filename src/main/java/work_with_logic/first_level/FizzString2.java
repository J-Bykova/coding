package work_with_logic.first_level;

public class FizzString2 {
    static String fizzString2(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz!";
        }
        if (n % 3 == 0) {
            return "Fizz!";
        }
        if (n % 5 == 0) {
            return "Buzz!";
        }
        return String.valueOf(n) + "!";
    }
}
