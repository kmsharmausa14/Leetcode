package Medium1000Onwards;
//1214
import java.util.*;

public class TwoSumBSTs {
	public boolean twoSumBSTs(TreeNode root1, TreeNode root2, int target) {
		  // Convert to list
		  List<Integer> list1 = new ArrayList<>();
		  List<Integer> list2 = new ArrayList<>();
		  listByInorder(root1, list1);
		  listByInorder(root2, list2);
		  // Two Pointers
		  int lo = 0, hi = list2.size() - 1;
		  while (lo < list1.size() && hi >= 0) { // notice the condition here
		    int sum = list1.get(lo) + list2.get(hi);
		    if (sum == target) {
		      return true;
		    } else if (sum < target) {
		      ++lo;
		    } else {
		      --hi;
		    }
		  }
		  return false;
		}

		private void listByInorder(TreeNode root, List<Integer> list) {
		  if (root == null) {
		    return;
		  }
		  listByInorder(root.left, list);
		  list.add(root.val);
		  listByInorder(root.right, list);
		}
}
