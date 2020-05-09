package Nonleetcode;

public class SelectionSort {

	public static void main(String[] args) {
		int[] nums = {64,25,12,22,11};
		SelectionSort ss = new SelectionSort();
		nums = ss.selectionSort(nums);
		System.out.println("Welcome Bhai");
	}
	
	public int[] selectionSort(int[] A)
	{
		int len = A.length;
		for(int i=0;i<len-1;i++)
		{
			int min_index=i;
			for(int j=i+1;j<len;j++)
			{
				if(A[j]<A[min_index])
				{
					min_index = j;
				}
			}
			int temp = A[i];
			A[i]=A[min_index];
			A[min_index]=temp;
		}
		return A;
	}
}
