package Nonleetcode;

import java.util.*;

public class CombinationSum {

	public static void main(String[] args) {
		CombinationSum cs = new CombinationSum();
		List<List<Integer>> ans = cs.combinationSum3(3,7);
	}

	public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        helper(result,current,k,1,n,n);
        return result;
    }
    
    public void helper(List<List<Integer>> result,List<Integer> current, int k, int pos, int n,int sum)
    {
    	if(sum<0)
            return;
        if(pos==k)
        {
            if(sum==0)
            {
                result.add(new ArrayList<>(current));
                return;
            }
        }
        
        for(int j=pos;j<=9;j++)
        {
            current.add(j);
            helper(result,current,k,j+1,n,sum-j);
            current.remove(current.size()-1);    
        }
    }
}
