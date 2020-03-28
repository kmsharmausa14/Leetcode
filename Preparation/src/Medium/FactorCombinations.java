package Medium;
import java.util.*;

public class FactorCombinations {

	public static void main(String[] args) {
		
	}

	public List<List<Integer>> getFactors(int n)
	{
		List<List<Integer>> ret = new ArrayList<List<Integer>>();
		if(n<=1)
			return ret;
		helper(2,n,new ArrayList<Integer>(), ret);
		return ret;
	}
	
	public void helper(int begin, int n,List<Integer> group, List<List<Integer>> ret)
	{
		if(n==1)
		{
			if(group.size()>1)
			{
				ret.add(new ArrayList<Integer>(group));
			}
			return;
		}
		
		for(int i=begin;i<=n;i++)
		{
			if(n%i==0)
			{
				group.add(i);
				helper(i,n/i,group,ret);
				group.remove(group.size()-1);
			}
		}
	}
}
