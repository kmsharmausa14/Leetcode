package Medium325Onwards;

public class FindPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] findPermutation(String s)
	{
		s=s+".";
		int[] res = new int[s.length()];
		int min=-1,i=0;
		while(i<res.length)
		{
			if(s.charAt(i)!='D')
				res[i++]=min++;
			else
			{
				int j=i;
				while(s.charAt(j)=='D')
					j++;
				for(int k=j;k>=i;k--)
					res[k]=min++;
				i=j+1;
			}
		}
		return res;
	}

}
