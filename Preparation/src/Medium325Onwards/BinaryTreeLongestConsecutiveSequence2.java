package Medium325Onwards;
//549
public class BinaryTreeLongestConsecutiveSequence2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	int max=0;
	
	class Result
	{
		TreeNode node;
		int inc;
		int des;
	}
	
	public int longestConsecutive(TreeNode root)
	{
		traverse(root);
		return max;
	}
	
	public Result traverse(TreeNode node)
	{
		if(node==null)
			return null;
		Result left = traverse(node.left);
		Result right = traverse(node.right);
		
		Result curr = new Result();
		curr.node=node;
		curr.inc=1;
		curr.des=1;
		
		if(left!=null)
		{
			if(node.val-left.node.val==1)
				curr.inc=Math.max(curr.inc, left.inc+1);
			else if(node.val-left.node.val==-1)
				curr.des=Math.max(curr.des, left.des+1);
		}
		if(right!=null)
		{
			if(node.val-right.node.val==1)
				curr.inc=Math.max(curr.inc, right.inc+1);
			else if(node.val-right.node.val==-1)
				curr.des=Math.max(curr.des, right.des+1);
		}
		max=Math.max(max, curr.inc+curr.des+1);
		return curr;
	}
}
