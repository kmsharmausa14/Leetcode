package locked;

import java.util.*;

public class NumberOfCornerRectangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int countCornerRectangles(int[][] grid)
	{
		if(grid==null || grid.length<2 || grid[0]==null ||grid[0].length<2)
			return 0;
		
		int ans=0;
		Map<Integer,Integer> map = new HashMap<>();
		int m=grid.length;
		int n=grid[0].length;
		
		for(int r1=0;r1<m;r1++)
		{
			for(int r2=r1+1;r2<m;r2++)
			{
				for(int c=0;c<n;c++)
				{
					if(grid[r1][c]==1 && grid[r2][c]==1)
					{
						int pos=r1*n+r2;
						if(map.containsKey(pos))
						{
							int val =map.get(pos);
							ans+=val;
							map.put(pos,val+1);
						}
						else
							map.put(pos, 1);
					}
				}
			}
		}
		return ans;
	}
}
