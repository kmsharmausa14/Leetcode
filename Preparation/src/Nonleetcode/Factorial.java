package Nonleetcode;

public class Factorial {

	public static void main(String[] args) {
		Factorial f = new Factorial();
		//int ans = f.fact(5);
		//int ans = f.pow(2,5);
		int ans = f.count1(6);
		System.out.println(ans);
	}

	public int fact(int x)
	{
		if(x==1)
			return 1;
		return x*fact(x-1);
	}
	
	
	/*
	 * Calculate n^k recursively
	 */
	public int pow(int n,int k)
	{
		if(k==0)
			return 1;
		return n*pow(n,k-1);
	}
	
	/*
	 * Subsets of a set of size n (Decrease and conquer)
	 */
	public int count(int n)
	{
		if(n==0)
			return 1;
		return 2*(count(n-1));
	}
	
	/*
	 * Subsets of a set of size n (Divide and conquer)
	 */
	public int count1(int n)
	{
		if(n==0)
			return 1;
		if(n%2==0)
			return 2*count1(n/2);
		else
			return 2*(1+count1(n/2));
	}
	
	/*
	 * total no. of ways for Selecting k persons out of n persons
	 */
	public int combinations(int n,int k)
	{
		if(n<=1 || k==0 || k==1)
			return 1;
		return combinations(n-1,k-1) + combinations(n-1,k); 
	}
}
