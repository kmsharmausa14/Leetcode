package Easy;

public class MissingNumberInArithmeticProgression {

	public static void main(String[] args) {
		int arr[] = {15,13,12}; 
	    int n = arr.length; 
	    System.out.println("The missing element is "+    
	                            findMissing(arr, n));
	}
	
	static int findMissing(int arr[], int n) 
	{ 
	    // If exactly one element is missing,  
	    // then we can find difference of 
	    // arithmetic progression using  
	    // following formula. Example, 2, 4,  
	    // 6, 10, diff = (10-2)/4 = 2. 
	    // The assumption in formula is that  
	    // the difference is an integer. 
	    int diff = (arr[n - 1] - arr[0]) / n; 
	  
	    // Binary search for the missing  
	    // number using above calculated diff 
	    return findMissingUtil(arr, 0, n - 1, diff); 
	} 

	// A binary search based  
	// recursive function that  
	// returns the missing  
	// element in arithmetic 
	// progression 
	static int findMissingUtil(int arr[], int low,  
	                           int high, int diff) 
	{ 
	    // There must be two elements 
	    // to find the missing 
	    if (high <= low) 
	        return Integer.MAX_VALUE; 
	  
	    // Find index of  
	    // middle element 
	    int mid = low + (high - low) / 2; 
	  
	    // The element just after the  
	    // middle element is missing.  
	    // The arr[mid+1] must exist,  
	    // because we return when 
	    // (low == high) and take 
	    // floor of (high-low)/2 
	    if (arr[mid + 1] - arr[mid] != diff) 
	        return (arr[mid] + diff); 
	  
	    // The element just  
	    // before mid is missing 
	    if (mid > 0 && arr[mid] -  
	                   arr[mid - 1] != diff) 
	        return (arr[mid - 1] + diff); 
	  
	    // If the elements till mid follow  
	    // AP, then recur for right half 
	    if (arr[mid] == arr[0] + mid * diff) 
	        return findMissingUtil(arr, mid + 1,  
	                               high, diff); 
	  
	    // Else recur for left half 
	    return findMissingUtil(arr, low, mid - 1, diff); 
	} 
}
