package Medium;import java.util.*;
//163
public class MissingRanges {

	public static void main(String[] args) {
		int[] nums = new int[] {0,1,3,50,75};
		int lower=0;
		int upper=99;
		System.out.println(findMissingRanges(nums,lower,upper));
	}
	
	public static List<String> findMissingRanges(int[] nums,int lower,int upper)
	{
		List<String> ranges = new ArrayList();
		int len = nums.length;
		if(len==0)
		{
			if(lower<=upper)
				ranges.add(getRange(lower,upper));
			return ranges;
		}
		
		if(lower<nums[0])
			ranges.add(getRange(lower,nums[0]-1));
		for(int i=1;i<len;i++)
		{
			if(nums[i]>nums[i-1] && nums[i-1] != nums[i]-1)
			{
				ranges.add(getRange(nums[i-1]+1,nums[i]-1));
			}
		}
		if(upper>nums[len-1])
			ranges.add(getRange(nums[len-1]+1,upper));
		return ranges;
	}
	
	public static String getRange(int lower,int upper)
	{
		if(lower==upper)
			return lower+"";
		return lower+"->"+upper;
	}

}
