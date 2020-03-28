import java.util.*;

public class ThreeSumSmaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int threeSumsmaller(int[] nums,int target)
	{
		Arrays.sort(nums);
		int sum=0;
		for(int i=0;i<nums.length-2;i++)
			sum+=twoSumSmaller(nums,i+1,target-nums[i]);
		return sum;
	}
	
	public int twoSumSmaller(int[] nums,int startIndex,int target)
	{
		int sum=0;
		int left=startIndex;
		int right=nums.length-1;
		while(left<right)
		{
			if(nums[left]+nums[right] <target)
			{
				sum+=right-left;
				left++;
			}
			else
				right--;
		}
		return sum;
	}
}
