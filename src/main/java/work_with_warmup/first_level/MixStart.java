package work_with_warmup.first_level;

public class MixStart {
    static boolean mixStart(String str) {
        String startStr = "mix";
        if(str.length() >= 3 && str.substring(0, 3).equals(startStr)){
            return true;
        }
        return false;
    }
}
