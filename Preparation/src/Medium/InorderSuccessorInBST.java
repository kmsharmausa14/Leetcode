package Medium;
public class InorderSuccessorInBST {
//285
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public class TreeNode
	{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x)
		{
			val=x;
		}
	}
	
	public TreeNode inorderSuccessor(TreeNode root, TreeNode p)
	{
		if(root==null)
			return null;
		
		TreeNode next=null;
		TreeNode c=root;
		
		while(c!=null && c.val!=p.val)
		{
			if(c.val > p.val)
			{
				next=c;
				c=c.left;
			}
			else
				c=c.right;
		}
		
		if(c==null)
			return null;
		
		if(c.right==null)
			return next;
		
		c=c.right;
		while(c.left!=null)
			c=c.left;
		
		return c;
	}
}
