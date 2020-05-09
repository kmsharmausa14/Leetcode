package Nonleetcode;

public class BubbleSort {

	public static void main(String[] args) {
		int[] nums = {64,25,12,22,11};
		BubbleSort ss = new BubbleSort();
		nums = ss.bubbleSort(nums);
		System.out.println("Welcome Bhai");
	}
	public int[] bubbleSort(int[] A)
	{
		int len = A.length;
		for(int i=0;i<len;i++)
		{
			for(int j=len-1;j>i;j--)
			{
				if(A[j-1]>A[j])
				{
					int temp = A[j-1];
					A[j-1]=A[j];
					A[j]=temp;
				}
			}			
		}
		return A;
	}
}
