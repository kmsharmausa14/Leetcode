package Nonleetcode;

public class InsertionSort {

	public static void main(String[] args) {
		int[] nums = {64,25,12,22,11};
		InsertionSort ss = new InsertionSort();
		nums = ss.insertionSort(nums);
		System.out.println("Welcome Bhai");
	}
	public int[] insertionSort(int[] A)
	{
		int len = A.length;
		for(int i=1;i<len;i++)
		{
			int key=A[i];
			int j=i-1;
			while(key<A[j] && j>=0)
			{
				A[j+1]=A[j];
				j=j-1;
			}
			A[j+1]=key;
		}
		return A;
	}
}
