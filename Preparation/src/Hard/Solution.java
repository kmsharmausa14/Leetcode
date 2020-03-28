package Hard;
import java.awt.Point;
import java.util.*;
public class Solution {

	public static void main(String[] args) {
		//intersectionSizeTwo(new int[][]{{1, 3}, {1, 4}, {2, 5}, {3, 5}});
		//judgePoint24(10,new int[] {10,1,2,7,6,1,5});
		//Solution(10,new int[] {3,5,8,9});
		//WordFilter(new String[] {"apple"});
		findSubsequences(new int[] {1,1,1,0,0,0,1,1,1,1,0},2);
		//h=h+"";
		
	}
	
	public static int findSubsequences(int[] A, int K) {
        int i=0,j;
        for(j=0;j<A.length;j++)
        {
            if(A[j]==0)
                K--;
            if(K<0 && A[i++]==0)
                K++;
        }
        return j-i;
    }
    
}
