package Medium325Onwards;
//325
import java.util.*;

public class MaximumSizeSubarraySumEqualsk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int maxSubArrayLen(int[] nums, int k)
	{
		HashMap<Integer,Integer> map = new HashMap<>();
		map.put(0, -1);
		int result=0;
		int sum=0;
		
		for(int i=0;i<nums.length;i++)
		{
			sum+=nums[i];
			if(map.containsKey(sum-k))
				result = Math.max(result, i-map.get(sum-k));
			map.putIfAbsent(sum, i);
		}
		return result;
	}

}
