
public class CountUnivalueSubtrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	int count=0;
	/*
	public int countUnivalueSubtrees(TreeNode root)
	{
		unival(root);
		return count;
	}
	
	public boolean unival(TreeNode root)
	{
		if(root==null)
			return true;
		if(root.left==null && root.right==null)
		{
			count++;
			return true;
		}
		boolean left = unival(root.left);
		boolean right= unival(root.right);
		
		if(left && right && (root.left==null || root.left.val ==root.val) && (root.right==null || root.right.val == root.val))
		{
			count++;
			return true;
		}
		return false;
	}
	*/
}
