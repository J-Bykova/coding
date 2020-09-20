package work_with_warmup.first_level;

public class EndUp {
    static final String endUp(String str) {
        if(str.length() <= 3){
            return str.toUpperCase();
        }

        String endUpStr = str.substring(str.length()-3).toUpperCase();
        return str.substring(0, str.length()-3) + endUpStr;
    }
}
