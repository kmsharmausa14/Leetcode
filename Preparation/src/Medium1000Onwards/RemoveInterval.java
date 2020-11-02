package Medium1000Onwards;
//1272
import java.util.*;

public class RemoveInterval {

	public List<List<Integer>> removeInterval(int[][] intervals, int[] toBeRemoved) {
	    List<List<Integer>> l = new ArrayList<>();        
	    for (int[] interval: intervals) {
	        if (interval[1] >= toBeRemoved[0] && interval[0] <= toBeRemoved[1]) {
	            if (interval[0] < toBeRemoved[0]) l.add(new ArrayList<>(Arrays.asList(interval[0], toBeRemoved[0])));
	            if (interval[1] > toBeRemoved[1]) l.add(new ArrayList<>(Arrays.asList(toBeRemoved[1], interval[1])));
	        } else l.add(new ArrayList<>(Arrays.asList(interval[0], interval[1])));
	    }
	    return l;        
	}
}
