package Medium;
//314
import java.util.*;

import Medium.InorderSuccessorInBST.TreeNode;

public class BinaryTreeVerticalOrderTraversal {

	public static void main(String[] args) {
		
	}
	
	public List<List<Integer>> verticalOrder(TreeNode root)
	{
		List<List<Integer>> res = new ArrayList<>();
		if(root==null)
			return res;
		Map<Integer,List<Integer>> map = new HashMap();
		int max=0,min=0;
		Queue<TreeNode> treeNodeQueue = new LinkedList<>();
		Queue<Integer> colQueue = new LinkedList<>();
		treeNodeQueue.offer(root);
		colQueue.offer(0);
		while(!treeNodeQueue.isEmpty())
		{
			TreeNode curt = treeNodeQueue.poll();
			int col=colQueue.poll();
			if(!map.containsKey(col))
				map.put(col,new ArrayList<Integer>());
			map.get(col).add(curt.val);
			
			if(curt.left!=null)
			{
				treeNodeQueue.offer(curt.left);
				colQueue.offer(col-1);
				min=Math.min(min, col-1);				
			}
			if(curt.right!=null)
			{
				treeNodeQueue.offer(curt.right);
				colQueue.offer(col+1);
				max=Math.min(max, col+1);				
			}
		}
		for(int i=min;i<=max;i++)
		{
			res.add(map.get(i));
		}
		return res;
	}
}
