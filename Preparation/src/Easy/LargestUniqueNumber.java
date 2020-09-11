package Easy;
//1133
import java.util.*;
public class LargestUniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int largestUniqueNumber(int[] A) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int num : A) {
	      map.put(num, map.getOrDefault(num, 0) + 1);
	    }
	    int max = -1;
	    for (Integer key : map.keySet()) {
	      if (map.get(key) == 1) {
	        max = Math.max(key, max);
	      }
	    }
	    return max;
	  }

}
