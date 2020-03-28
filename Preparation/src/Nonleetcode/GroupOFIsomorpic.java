package Nonleetcode;
import java.util.*;

public class GroupOFIsomorpic {

    public static void main(String[] args) {
        String[] list ={"apple","apply","dog","cog","romi","egg","add","paper","title"};
        List<List<String>> res = groupIsomorphic(list);
    }

    public static List<List<String>> groupIsomorphic(String[] strs) {
        if(strs.length == 0)
            return null;

        Map<String, List>map = new HashMap <>();
        for(String s : strs){
    
           
            int countindex = 1;
            StringBuilder sb1 = new StringBuilder();
            for(int i=0;i<s.length()-1;i++) {
                if(s.charAt(i) == s.charAt(i+1)) {
                    countindex++;
                   
                    sb1.append(countindex);

                } else {
                    countindex = 1;
                    sb1.append(countindex);
                }
            }

            String key = sb1.toString();
            if(!map.containsKey(key))
                map.put(key,new ArrayList<String>());
              map.get(key).add(s);
        }

        return new ArrayList (map.values());
    }
}
