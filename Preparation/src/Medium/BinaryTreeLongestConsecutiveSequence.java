package Medium;
//298
import Medium.InorderSuccessorInBST.TreeNode;

public class BinaryTreeLongestConsecutiveSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	int result;
	public int longestConsecutive(TreeNode root)
	{
		if(root==null)
			return 0;
		result=1;
		dfsHelper(root,null,1);
		return result;
	}
	
	public void dfsHelper(TreeNode node,TreeNode prev,int maxLen)
	{
		if(node==null)
			return;
		if(prev!=null && node.val==prev.val+1)
		{
			maxLen++;
			result = Math.max(result, maxLen);
		}
		else
			maxLen=1;
		dfsHelper(node.left,node,maxLen);
		dfsHelper(node.right,node,maxLen);
	}

}
