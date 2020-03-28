import java.util.List;

public class Flatten2DVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	int[] arrCounters;
	int counter=0;
	
	public Flatten2DVector(List<List<Integer>> vec2d)
	{
		int cnt=0;
		if(vec2d==null)
			arrCounters = new int[0];
		else
		{
			for(List<Integer> l : vec2d)
			{
				for(int in:l)
				{
					arrCounters[cnt++]=in;
				}
			}
		}
	}
	
	public int next()
	{
		int val=Integer.MIN_VALUE;
		if(counter < arrCounters.length)
		{
			val=arrCounters[counter];
		}
		counter++;
		return val;
	}
	
	public boolean hasNext()
	{
		return counter<arrCounters.length;
	}
}
