package Medium573Onwards;

import java.util.*;

public class NumberOfDistinctIslands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	int[][] grid;
	boolean[][] seen;
	Set<Integer> shape;
	
	public void explore(int r,int c,int r0,int c0)
	{
		if(r>=0 && r<grid.length && c>=0 && c<grid[0].length && grid[r][c]==1 && !seen[r][c])
		{
			seen[r][c]=true;
			shape.add((r-r0)*2 * grid[0].length + (c-c0));
			explore(r+1,c,r0,c0);
			explore(r-1,c,r0,c0);
			explore(r,c+1,r0,c0);
			explore(r,c-1,r0,c0);
		}
	}
	public int numDistinctIslands(int[][] grid)
	{
		this.grid=grid;
		seen = new boolean[grid.length][grid[0].length];
		Set shapes = new HashSet<HashSet<Integer>>();
		
		for(int r=0;r<grid.length;r++)
			for(int c=0;c<grid[0].length;c++)
			{
				shape = new HashSet<Integer>();
				explore(r,c,r,c);
				if(!shape.isEmpty())
					shapes.add(shape);
			}
		return shapes.size();
	}
}
