package work_with_map.first_level;

import java.util.Map;

public class MapShare {
    static Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        map.remove("c");
        return map;
    }
}
