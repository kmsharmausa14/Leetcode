package Medium;
//156
public class BinaryTreeUpsideDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public TreeNode upsideDownBinaryTree(TreeNode root)
	{
		if(root==null || root.left==null)
			return null;
		
		TreeNode left=upsideDownBinaryTree(root.left);
		root.left.left=root.right;
		root.left.right=root;
		
		root.left=null;
		root.right=null;
		return left;
	}
	
}
