package Easy;
//1085
public class SumofDigitsintheMinimumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int sumOfDigits(int[] A) {

	    //Find minimum
	    int min = Integer.MAX_VALUE;
	    for(int i = 0; i < A.length; i++){
	        if(A[i] < min){
	            min = A[i];
	        }
	    }
	    int n = 0;
	    int sum = 0;
	    
	    //Sum of minimum
	    while(min > 0){
	        n = min % 10;
	        sum = sum + n;
	        min = min / 10;
	    }
	    
	    //Odd-Even Check
	    if(sum % 2 != 0){
	        return 0;
	    }else{
	        return 1;
	    }
}
}