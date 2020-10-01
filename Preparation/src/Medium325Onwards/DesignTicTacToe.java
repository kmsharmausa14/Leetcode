package Medium325Onwards;
//348
public class DesignTicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	int[] rows;
	int[] cols;
	int dc1;
	int dc2;
	int n;
	public DesignTicTacToe(int n)
	{
		this.n=n;
		this.rows=new int[n];
		this.cols=new int[n];
	}
	
	public int move(int row,int col,int player)
	{
		int val = (player==1?1:-1);
		rows[row]+=val;
		cols[col]+=val;
		if(row==col)
			dc1+=val;
		if(col==n-row-1)
			dc2+=val;
		if(Math.abs(rows[row])==n
		   ||Math.abs(cols[col])==n
			 ||Math.abs(dc1)==n
||Math.abs(dc2)==n)
			return player;
		return 0;
	}
}
