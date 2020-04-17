package work_with_string.first_level;

public class PopulateTemplate {
    static String populateTemplate(String out, String word) {
        return out.substring(0, out.length() / 2) + word + out.substring(out.length() / 2);
    }
}
