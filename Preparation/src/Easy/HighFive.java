package Easy;
//1086
import java.util.*;

class Record {
    public int id, score;
    public Record(int id, int score){
        this.id = id;
        this.score = score;
    }
}
public class HighFive {
	
		 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Map<Integer, Double> highFive(Record[] results) {
        Map<Integer, Double> ans = new HashMap<Integer, Double>();
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        
        for (int i = 0; i < results.length; i++) {
            
            if (!map.containsKey(results[i].id)) {
                PriorityQueue<Integer> pq = new PriorityQueue<>(5, new Comparator<Integer>() {
                    public int compare(Integer a, Integer b) {
                        return a - b; // min-heap
                    } 
                });
                map.put(results[i].id, pq);
            }
            PriorityQueue<Integer> pq = map.get(results[i].id);
            if (pq.size() < 5) {
                pq.add(results[i].score);
            } else {
                int cur = pq.poll();
                if (results[i].score > cur) {
                    pq.add(results[i].score);
                } else {
                    pq.add(cur);
                }
            }
        }
        
        // 
        for (Integer i : map.keySet()) {
            double avg = 0;
            for (int j = 0; j < 5; j++) {
                avg = avg + map.get(i).poll();
            }
            avg = avg / 5;
            ans.put(i, avg);
        }
        return ans;
    }
}
