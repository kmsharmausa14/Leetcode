package Medium325Onwards;
//362
import java.util.*;

public class DesignHitCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	Queue<Integer> q=null;
	public void DesignHitCounter()
	{
		q=new LinkedList<Integer>();
	}
	
	public void hit(int timestamp)
	{
		q.offer(timestamp);
	}
	
	public int getHits(int timestamp)
	{
		while(!q.isEmpty() && timestamp-q.peek()>=300)
			q.poll();
		return q.size();
	}
}
