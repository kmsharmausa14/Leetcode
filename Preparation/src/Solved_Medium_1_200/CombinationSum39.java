package Solved_Medium_1_200;

import java.util.*;

public class CombinationSum39 {

	public static void main(String[] args) {
		combinationSum(new int[] {2,3,6,7},7);

	}

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        helper(list,new ArrayList<Integer>(),0,candidates,target);
        return list;
    }
    
    public static void helper(List<List<Integer>> list,List<Integer> temp,int start,int[] candidates,int target)
    {
        if(target==0)
        {
            list.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<candidates.length;i++)
        {
            if (candidates[i] <= target) 
            {
                temp.add(candidates[i]);
                helper(list,temp,i,candidates,target-candidates[i]);
                temp.remove(temp.size()-1);   
            }            
        }
    }
}
