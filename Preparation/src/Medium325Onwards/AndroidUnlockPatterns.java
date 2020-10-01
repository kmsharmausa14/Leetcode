package Medium325Onwards;
//351
public class AndroidUnlockPatterns {

	public static void main(String[] args) {
		
	}

	boolean used[] = new boolean[9];
	
	public int numberOfPatterns(int m,int n)
	{
		int res=0;
		for(int len=m;len<=n;len++)
		{
			res+=calcPatterns(-1,len);
			for(int i=0;i<9;i++)
			{
				used[i]=false;
			}
		}
		return res;
	}
	
	public boolean isValid(int index,int last) 
	{
		if(used[index])
			return false;
		
		if(last==-1)
			return true;
		
		if((index+last)%2==1)
			return true;
		
		int mid=(index+last)/2;
		if(mid==4)
			return used[mid];
		
		if((index%3!=last%3) && (index/3!=last/3))
		{
			return true;
		}
		return used[mid];
	}
	
	public int calcPatterns(int last,int len)
	{
		if(len==0)
			return 1;
		int sum=0;
		for(int i=0;i<9;i++)
		{
			if(isValid(i,last))
			{
				used[i]=true;
				sum+=calcPatterns(i,len-1);
				used[i]=false;
			}
		}
		return sum;
	}
}
