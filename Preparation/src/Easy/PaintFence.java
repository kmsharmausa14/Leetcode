package Easy;
//276
public class PaintFence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int numWayPaintFence(int n,int k)
	{
		if(n==0)
			return 0;
		if(n==1)
			return k;
		
		int same = k;
		int diff = k*(k-1);
		
		for(int i=3;i<=n;i++)
		{
			int prevDiff = diff;
			diff = (same + diff) * (k-1);
			same = prevDiff * 1;
		}
		return same + diff;
	}

}
