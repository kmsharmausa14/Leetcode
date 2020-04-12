package Medium1000Onwards;

import java.util.*;

public class SmallestCommonRegion {
	public String findSmallestRegion(List<List<String>> regions, String region1, String region2) {
        HashMap<String, String> hm = new HashMap<>();
        for(List<String> item : regions){
            String parent = item.get(0);
            for(int i = 1; i<item.size(); i++){
                hm.put(item.get(i), parent);
            }
        }
        
        HashSet<String> used = new HashSet<>();
        while(region1 != null){
            used.add(region1);
            region1 = hm.get(region1);
        }
        
        while(!used.contains(region2)){
            region2 = hm.get(region2);
        }
        
        return region2;
    }
}
