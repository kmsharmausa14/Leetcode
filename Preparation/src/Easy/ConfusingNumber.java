package Easy;

import java.util.*;
//1056
public class ConfusingNumber {

	public boolean confusingNumber(int N) {
		          HashMap<Integer, Integer> hm = new HashMap<>();
		          hm.put(0, 0);
		          hm.put(1, 1);
		          hm.put(6, 9);
		          hm.put(9, 6);
		          hm.put(8, 8);
		          int cur = 0;
		         int temp = N;
		         
		         while(N > 0){
		             int d = N % 10;
		             if(!hm.containsKey(d)){
		                 return false;
		             }
		             
		             cur = cur * 10 + hm.get(d);
		             N /= 10;
		         }
		       
		         return cur != temp;
		     }
}
