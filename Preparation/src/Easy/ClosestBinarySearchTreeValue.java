package Easy;

public class ClosestBinarySearchTreeValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String f = getHint("1807","7810");
	}

	public int closestValue(TreeNode root, double target) {
        TreeNode cur = root;
        double minDiff = 2.0*Integer.MAX_VALUE;
        int minPoint = -1;
        while(cur != null){
            if(Math.abs((double)cur.val-target) < minDiff){
                minDiff = Math.abs((double)cur.val-target);
                minPoint = cur.val;
            }
            if(cur.val<target){
                cur = cur.right;
            }else{
                cur = cur.left;
            }
        }
        return minPoint;
    }
}
