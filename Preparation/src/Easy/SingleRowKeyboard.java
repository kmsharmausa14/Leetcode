package Easy;
//1165
import java.util.*;
public class SingleRowKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int calculateTime(String keyboard, String word) {
	    Map<Character, Integer> map = new HashMap<>();
	    int pos = 0;
	    for (char c : keyboard.toCharArray()) {
	      map.put(c, pos++);
	    }
	    int total = 0;
	    int currPos = 0;
	    for (char c : word.toCharArray()) {
	      total += Math.abs(currPos - map.get(c));
	      currPos = map.get(c);
	    }
	    return total;
	  }
}
