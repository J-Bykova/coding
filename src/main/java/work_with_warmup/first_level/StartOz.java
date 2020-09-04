package work_with_warmup.first_level;

public class StartOz {
    static String startOz(String str) {

        String result = "";

        if (str.length() >= 1 && str.substring(0,1).equals("o")){
            result = result + str.charAt(0);
        }
        if (str.length() >=2 && str.substring(1,2).equals("z")){
            result = result + str.charAt(1);
        }

        return result;
    }
}
