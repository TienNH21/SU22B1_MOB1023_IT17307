package buoi7_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoMap {
    public static void main(String[] args) {
        Map<String, Integer> dssp = new 
            HashMap<String, Integer>();
        
        dssp.put("ipX", 6);
        dssp.put("ip11", 10);
        dssp.put("ip12", 16);
        dssp.put("ip13", 18);
        System.out.println(dssp);
        
        dssp.put("ipX", 36);
        System.out.println(dssp);
        
        Set<String> keys = dssp.keySet();
        
        for (String key: keys) {
            Integer value = dssp.get(key);
            System.out.println(value);
        }
    }
}
