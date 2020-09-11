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
		
		List<String> inth =h.commonChars(str);
		int b=0;
	}
    
	public List<String> commonChars(String[] A) {
        int[] count = new int[26];
        Arrays.fill(count,Integer.MAX_VALUE);
        List<String> list = new ArrayList<>();
        for(String str:A)
        {
            char[] ch = str.toCharArray();
            int[] temp= new int[26];            
            for(char c:ch)
            {
                temp[c-'a']++;
            }
            for(int y=0;y<26;y++)
            {
                count[y]=Math.min(temp[y],count[y]);
            }
        }
        
        for(int i=0;i<26;i++)
        {
            if(count[i]!=Integer.MAX_VALUE)
                while(count[i]>0)
                {
                    list.add(""+(char)('a'+i));
                    count[i]--;
                }
        }
        return list;
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
