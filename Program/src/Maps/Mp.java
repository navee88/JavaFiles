package Maps;

import java.util.HashMap;
import java.util.Map;

public class Mp {
    public static void main(String[] args) {
        Map<String , Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);
        System.out.println("Map after put: " + map);

        for(Map.Entry<String, Integer> mp : map.entrySet()){
            System.out.println(mp.getKey() +" "+mp.getValue());
        }

    }
}
