package Medium573Onwards;
//663
import java.util.*;

public class EqualTreePartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	Stack<Integer> seen;
	
	public boolean checkEqualTree(TreeNode root)
	{
		seen = new Stack();
		int total = sum(root);
		seen.pop();
		if(total%2==0)
			for(int s:seen)
				if(s==total/2)
					return true;
		return false;
	}
	
	public int sum(TreeNode node)
	{
		if(node==null)
			return 0;
		seen.push(sum(node.left) + sum(node.right) + node.val);
		return seen.peek();
	}
}
