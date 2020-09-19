package Easy;
//760
import java.util.*;

public class FindAnagramMappings {

	public static void main(String[] args) {
		
	}
	
	public static int[] anagramMappings(int[] A,int[] B)
	{
		Map<Integer,Integer> D = new HashMap<>();
		for(int i=0;i<B.length;i++)
			D.put(B[i],i);
		int[] ans = new int[A.length];
		int t=0;
		for(int x:A)
			ans[t++]=D.get(x);
		return ans;
	}
}
