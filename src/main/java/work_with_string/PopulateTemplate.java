package work_with_string;

public class PopulateTemplate {
    static String populateTemplate(String out, String word) {
        return out.substring(0, out.length() / 2) + word + out.substring(out.length() / 2);
    }
}
