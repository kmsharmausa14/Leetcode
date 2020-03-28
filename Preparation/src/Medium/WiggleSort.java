package Medium;import java.util.*;

public class WiggleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void wiggleSort(int[] nums)
	{
		Arrays.sort(nums);
		for(int i=1;i<nums.length;i+=2)
		{
			swap(nums,i,i+1);
		}
	}
	
	public void swap(int[] nums,int i,int j)
	{
		int temp = nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
	}
}
