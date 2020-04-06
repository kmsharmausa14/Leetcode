package Easy;

import java.util.Arrays;

public class TwoSumLessThanK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int twoSumLessThanK(int[] A, int K) {
        // Sort the array first
        Arrays.sort(A);
        
        // Put pointers at begin/end and shrink
        int l = 0, r = A.length - 1;
        int ans = -1;
        while(l < r) {
            if(A[l] + A[r] < K) {
                ans = Math.max(ans, A[l] + A[r]);
                l++;
            } else {
                r--;
            }
        }
        
        return ans;
    }
}
