package Nonleetcode;

public class Fibonacci {
	int i=0;
	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		int res=f.fibo(4);
		String[] ans = f.binaryStrings(3);
		String[] ans1 = f.binaryStrings("",3);
		System.out.println(res);
	}

	public int fibo(int n)
	{
		if(n==1 || n==0)
			return n;
		return fibo(n-1)+fibo(n-2);
	}
	
	/*
	 * Return binary strings of size n all combinations Recursively (Exponential)
	 */
	
	public String[] binaryStrings(int n)
	{
		if(n==1)
			return new String[] {"0","1"};
		else
		{
			String[] prev = binaryStrings(n-1);
			String[] result = new String[10];
			for(String str:prev)
			{
				result[i++] = str+"0";
				result[i++] = str+"1";
			}
			return result;
		}
	}
	
	/*
	 * Return binary strings of size n all combinations Iteratively Linear
	 */
	public String[] binaryStrings(int n)
	{
		String[] result = new String[]{"0","1"};
		for(int i=2;i<n;i++)
		{			
			String[] newresult = new String[10];
			for(String str:result)
			{
				result[i++] = str+"0";
				result[i++] = str+"1";
			}
			newresult = result;
		}
	}
	
	/*
	 * Return binary strings of size n all combinations Recursively (Linear)
	 */
	
	public String[] binaryStrings(String slate,int n)
	{
		if(n==0)
			System.out.println(slate);
		else
		{
			binaryStrings(slate+"0",n-1);
			binaryStrings(slate+"1",n-1);
		}
	}
}
