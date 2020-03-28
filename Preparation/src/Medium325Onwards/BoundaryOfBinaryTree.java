package Medium325Onwards;

import java.util.*;

public class BoundaryOfBinaryTree {

	public static void main(String[] args) {
		
	}

	public List<Integer> boundaryOfBinaryTree(TreeNode root)
	{
		List<Integer> list = new ArrayList<>();
		if(root==null)
			return list;
		list.add(root.val);
		lboundary(root.left,list);
		leaves(root.left,list);
		leaves(root.right,list);
		rboundary(root.right,list);
		return list;
	}
	
	public void leaves(TreeNode root,List<Integer> list)
	{
		if(root==null)
			return;
		if(root.left==null && root.right==null)
		{
			list.add(root.val);
			return;
		}
		leaves(root.left,list);
		leaves(root.right,list);
	}
	
	public void lboundary(TreeNode root,List<Integer> list)
	{
		TreeNode curr = root;
		while(curr!=null)
		{
			// Do not add the right-most node, will add this node in leaves()
			if(curr.left==null && curr.right==null)
				break;
			list.add(curr.val);
			curr=(curr.left!=null)?curr.left:((curr.right!=null)?curr.right:null);
		}
	}
	public void rboundary(TreeNode root,List<Integer> list)
	{
		TreeNode curr = root;
		List<Integer> rlist = new ArrayList<>();
		while(curr!=null)
		{
			if(curr.left==null && curr.right==null)
				break;
			rlist.add(0,curr.val);
			curr = (curr.right != null)? curr.right : ((curr.left != null) ? curr.left:null);
		}
		list.addAll(rlist);
	}
}
