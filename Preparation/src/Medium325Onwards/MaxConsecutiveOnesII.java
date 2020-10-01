package Medium325Onwards;
//1004
import java.util.*;

public class MaxConsecutiveOnesII {

	public static void main(String[] args) {
		
	}
	
	public int maxConsecutive(int[] nums)
	{
		if(nums==null || nums.length==0)
			return 0;
		Queue<Integer> q = new LinkedList<>();
		int start=0,max=0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==0)
				q.offer(i);
			while(q.size()>1)
			{
				start=q.poll()+1;
			}
			max=Math.max(max, i-start+1);
		}
		return max;
	}

}
