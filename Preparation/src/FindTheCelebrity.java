
public class FindTheCelebrity {

	public static void main(String[] args) {
		
	}

	public int findCelebrity(int n)
	{
		if(n<=1)
			return -1;
		int left=0,right=n-1;
		//Find the potential candidate
		while(left<right)
		{
			if(knows(left,right))
				left++;
			else
				right--;
		}
		//validate the candidate
		int candidate = right;
		for(int i=0;i<n;i++)
		{
			if(i!=candidate && (!knows(i,candidate) || (knows(candidate,i))))
				return -1;
		}
		return candidate;
	}
	
	public boolean knows(int a,int b)
	{
		return true;
	}
}
