package work_with_string.first_level;

public class PopulateTemplate2 {
    static String populateTemplate2(String template, String data) {
        String leftHalfOfTheTemplate = template.substring(0, template.length() / 2);
        String rightHalfOfTheTemplate = template.substring(template.length() / 2);
        return leftHalfOfTheTemplate + data + rightHalfOfTheTemplate;
    }
}
