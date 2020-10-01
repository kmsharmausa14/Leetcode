package Medium;import java.util.*;
//281
public class ZigZagIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Iterator<Integer> it1;
	public Iterator<Integer> it2;
	int count=0;
	
	public ZigZagIterator(List<Integer> v1,List<Integer> v2)
	{
		it1 = v1.iterator();
		it2 = v2.iterator();
		count=0;
	}
	
	public int next()
	{
		int ans=0;
		if(!it1.hasNext())
			ans = (Integer)it2.next();
		else if (!it2.hasNext())
			ans = (Integer)it1.next();
		else if(count==0)
		{
			ans=(Integer)it1.next();
			count=1;
		}
		else
		{
			ans = (Integer) it2.next();
			count=0;
		}
		return ans;
	}
	
	public boolean hasNext()
	{
		return it1.hasNext() || it2.hasNext();
	}
}
