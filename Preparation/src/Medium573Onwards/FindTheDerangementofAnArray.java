package Medium573Onwards;
//634
public class FindTheDerangementofAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findDerangement(int n)
	{
		if(n==0)
			return 1;
		if(n==1)
			return 0;
		int[] dp = new int[n+1];
		dp[0]=1;
		dp[1]=0;
		for(int i=2;i<=n;i++)
			dp[i]=(int)(((i-1L)*(dp[i-1] + dp[i-2]))%100000007);
		return dp[n];
	}
}
