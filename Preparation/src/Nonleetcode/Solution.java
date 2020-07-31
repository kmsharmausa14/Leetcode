package Nonleetcode;

import java.util.*;

public class Solution {
	public static void main(String[] args) {	
		Solution h = new Solution();
		char[] ch = new char[] { 'G', 'B', 'G', 'G', 'R', 'B', 'R', 'G'};
		int[] ar = new int[] {1,2,2,3,1};
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
		
		String inth =h.convert("PAYPALISHIRING",3);
		int b=0;
	}
    
	public String convert(String s, int numRows) {
        List<StringBuilder> list = new ArrayList<>();
        for(int l=0;l<numRows;l++)
        {
            list.add(new StringBuilder());
        }
        int n = s.length();
        int i=0;
        int k=0;
        boolean br=false;
        while(i<n && k<n)
        {
            if(i==0||i==numRows)
                br=!br;
            if(br)
            {
                //list.get(i) = new StringBuilder();
                list.get(i).append(s.charAt(k++));
                i++;
            }
            else
            {
                i--;
                list.get(i).append(s.charAt(k++));                
            }            
        }
        StringBuilder res = new StringBuilder();
        for(int l=0;l<numRows;l++)
        {
            res.append(list.get(l));
        }
        return res.toString();
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
