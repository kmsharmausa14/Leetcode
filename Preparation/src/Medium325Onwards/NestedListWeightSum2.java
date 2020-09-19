package Medium325Onwards;

import java.util.*;

public class NestedListWeightSum2 {

	public static void main(String[] args) {
		
	}

	public int depthSumInverse(List<NestedInteger> nestedList)
	{
		if(nestedList==null || nestedList.isEmpty())
			return 0;
		int max=maxDepth(nestedList,1);
		return sum(nestedList,max);
	}
	
	public int maxDepth(List<NestedInteger> nestedList,int depth)
	{
		int max=depth;
		for(NestedInteger ni:nestedList)
		{
			if(!ni.isInteger())
				max=Math.max(max, maxDepth(ni.getList(),depth+1));
		}
	}
	
	public int sum(List<NestedInteger> nestedList,int depth)
	{
		int sum=0;
		for(NestedInteger ni:nestedList)
		{
			if(ni.isInteger())
				sum+=ni.getInteger()*depth;
			else
				sum+=sum(ni.getList(),depth-1);
		}
		return sum;
	}
}

/*
 * class Solution {
    public int depthSumInverse(List<NestedInteger> nestedList) {
        List<Integer> sumLevels = new ArrayList<>();
        Queue<NestedInteger> queue = new LinkedList<>();
        for(NestedInteger nest: nestedList) queue.offer(nest);
        
        while(!queue.isEmpty()) {
            int size = queue.size(), sum = 0;
            for(int i=0; i<size; i++) {
                NestedInteger ni = queue.poll();
                if (ni.isInteger()) sum += ni.getInteger();
                else {
                    for(NestedInteger nest: ni.getList()) queue.offer(nest);
                }
            }
            sumLevels.add(sum);
        }
        int result = 0, levels = sumLevels.size();
        int N = levels;
        for(int i = 0; i < levels; i++) {
            result += sumLevels.get(i) * N--;
        }
        return result;
    }
}*/
