package Nonleetcode;

import java.util.*;

public class Solution {
	public static void main(String[] args) {	
		Solution h = new Solution();
		char[] ch = new char[] { 'G', 'B', 'G', 'G', 'R', 'B', 'R', 'G'};
		int[] ar = new int[] {1,2,2,3,1};
		String[] str = new String[] {"bella","label","roller"};
		/*
		ListNode ans = new ListNode(2);
		ans.next = new ListNode(4);
		ans.next.next = new ListNode(3);
		
		ListNode ans1 = new ListNode(5);
		ans1.next = new ListNode(6);
		ans1.next.next = new ListNode(4);
		
		ans.next.next.next = new ListNode(3);
		ans.next.next.next.next = new ListNode(3);
		*/
		
		//TreeNode root = new TreeNode(5);
		//root.left = new TreeNode(8);
		//root.right = new TreeNode(5);
		//root.left.left = new TreeNode(2);
		//root.left.right = new TreeNode(4);
		//root.right.left = new TreeNode(15);
		//root.right.right = new TreeNode(7);
		
		h.findSubsequences(new int[] {4,6,7,7});
		int b=0;
	}
    
	public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        helper(new LinkedList<Integer>(), 0, nums, res);
        return res; 
    }
    private void helper(LinkedList<Integer> list, int index, int[] nums, List<List<Integer>> res){
        if(list.size()>1) 
        	res.add(new LinkedList<Integer>(list));
        Set<Integer> used = new HashSet<>();
        for(int i = index; i<nums.length; i++){
            if(used.contains(nums[i])) 
            	continue;
            if(list.size()==0 || nums[i]>=list.peekLast()){
                used.add(nums[i]);
                list.add(nums[i]); 
                helper(list, i+1, nums, res);
                list.remove(list.size()-1);
            }
        }
    }
}

class ListNode
{
	ListNode next;
	int val;
	ListNode(int val)
	{
		this.val = val;
		this.next = null;
	}
}

class TreeNode 
{
	TreeNode left;
	TreeNode right;
	int val;
	TreeNode(int val)
	{
		this.val = val;
		this.left=null;
		this.right = null;
	}
	
}
