package Medium325Onwards;
// 909
import java.util.*;

public class DesignSnakeGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	int[][] food;
	int index;
	int row,col;
	int x,y;
	int len;
	LinkedList<int[]> queue;
	
	public void SnakeGame(int width,int height,int[][] food)
	{
		this.food=food;
		this.index=0;
		this.x=0;
		this.y=0;
		this.row=height;
		this.col=width;
		this.queue = new LinkedList<int[]>();
		this.queue.offer(new int[] {0,0});
	}
	
	public int move(String direction)
	{
		switch(direction)
		{
			case "U":
				x--;
				break;
			case "L":
				y--;
				break;
			case "R":
				y++;
				break;
			case "D":
				x++;
				break;
		}
		
		if(!isValid(x,y))
			return -1;
		return process(x,y);
	}
	
	public boolean isValid(int x,int y)
	{
		if(x<0 || x>=row || y<0 || y>=col)
			return false;
		return true;
	}
	
	public int process(int x,int y)
	{
		if(index==food.length)
			queue.poll();
		else if(food[index][0]==x && food[index][1]==y)
		{
			len++;
			index++;
		}
		else
			queue.poll();
		for(int[] p:queue)
		{
			if(p[0]==x && p[1]==y)
				return -1;
		}
		queue.offer(new int[] {x,y});
		return len;
	}
}
