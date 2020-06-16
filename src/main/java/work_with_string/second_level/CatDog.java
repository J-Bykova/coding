package work_with_string.second_level;

//TODO я не знаю как это работает!!!
public class CatDog {
    static boolean catDog(String source) {
        int countCat = countWords(source, "cat");
        int countDog = countWords(source, "dog");

        return countCat == countDog;
    }

    static int countWords(String source, String pattern) {
        int counter = 0;
        int index = 0;
        while (true) {
            int foundAt = source.indexOf(pattern, index);
            if (foundAt == -1) {
                break;
            }
            if (foundAt == index) {
                index++;
                counter++;
            } else {
                index = foundAt;
            }
        }
        return counter;
    }
}
