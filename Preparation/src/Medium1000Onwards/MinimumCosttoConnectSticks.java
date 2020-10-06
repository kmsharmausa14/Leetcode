package Medium1000Onwards;
//1167
import java.util.PriorityQueue;

public class MinimumCosttoConnectSticks {
	public int connectSticks(int[] sticks) {
        if(sticks == null || sticks.length < 2){
            return 0;
        }
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num : sticks){
            minHeap.add(num);
        }
        
        int res = 0;
        while(minHeap.size() > 1){
            int merge = minHeap.poll() + minHeap.poll();
            res += merge;
            minHeap.add(merge);
        }
        
        return res;
    }
}
