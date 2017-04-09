package tw.org.iii;

import java.util.HashMap;
import java.util.Set;

public class Brad74 {
	public static void main(String[] args) {
		HashMap<String,Object> map = new HashMap<>();
        map.put("name", "Brad");
        map.put("weight", 80.5);
        map.put("gender", true);
//        System.out.println(map.get("gender"));
//        map.put("weight", 70.5);
//        System.out.println(map.get("weight"));
//        System.out.println(map);
        
        Set<String> Keys = map.keySet();
        for (String key : keys){
        	System.out.println(key + "=>" + map.get(key));
        }
        
        
	}

}
