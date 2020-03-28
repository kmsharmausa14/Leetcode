package Medium;

public class FlipGame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean canWin(String s)
	{
		if(s==null || s.length()==0)
			return false;
		return canWinHelper(s.toCharArray());
	}
	
	public boolean canWinHelper(char [] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]=='+' && arr[i+1]=='+')
			{
				arr[i]='-';
				arr[i+1]='-';
				boolean win = canWinHelper(arr);
				arr[i]='+';
				arr[i+1]='+';
				
				if(!win)
					return true;
			}
		}
		return false;
	}
}
