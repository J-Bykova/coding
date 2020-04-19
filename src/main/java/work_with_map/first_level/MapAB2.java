package work_with_map.first_level;

import java.util.Map;

public class MapAB2 {
    static Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String mapA = map.get("a");
            String mapB = map.get("b");
            if (mapA.equals(mapB)) {
                map.remove("a");
                map.remove("b");
            }
        }
        return map;
    }
}
