package Nonleetcode;

public class MergeSort {

	public static void main(String[] args) {
		int[] nums = {64,25,12,22,11};
		MergeSort ss = new MergeSort();
		ss.mergeSort(nums,0,nums.length-1);
		System.out.println("Welcome Bhai");
	}
	public void mergeSort(int[] A,int l,int r)
	{
		if(l<r)
		{
			int m = (l+r)/2;
			mergeSort(A,l,m);
			mergeSort(A,m+1,r);
			merge(A,l,m,r);;
		}
	}
	
	void merge(int[] A,int l,int m,int r)
	{
		int n1 = m-l+1;
		int n2 = r-m;
		
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		for(int i=0;i<n1;i++)
			L[i]=A[l+i];
		
		for(int i=0;i<n2;i++)
			R[i]=A[m+1+i];
		
		int i=0,j=0;
		int k=l;
		while(i<n1 && j<n2)
		{
			if (L[i] <= R[j]) 
            { 
                A[k] = L[i]; 
                i++; 
            } 
            else
            { 
                A[k] = R[j]; 
                j++; 
            } 
            k++; 
		}
		
		while (i < n1) 
        { 
            A[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            A[k] = R[j]; 
            j++; 
            k++; 
        } 
	}
}
