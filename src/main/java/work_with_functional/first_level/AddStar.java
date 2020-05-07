package work_with_functional.first_level;

import java.util.List;

public class AddStar {
    static List<String> addStar(List<String> strings) {
        strings.replaceAll(n -> n + "*");
        return strings;
    }
}
