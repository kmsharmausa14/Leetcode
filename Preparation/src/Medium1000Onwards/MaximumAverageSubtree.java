package Medium1000Onwards;
//1120
public class MaximumAverageSubtree {

	double max = 0;
    public double maximumAverageSubtree(TreeNode root) {
        dfs(root);
        return max;
    }
    class Item{
        int n;
        double sum;
        public Item(int n , double sum){
            this.n = n;
            this.sum = sum;
        }
    }
    public Item dfs(TreeNode root){
        if(root==null) return new Item(0,0.0);
        // now root is not null
        Item left = dfs(root.left);
        Item right =dfs(root.right);
        int totaln = left.n+right.n+1;
        double totalsum = left.sum+right.sum+root.val;
        double ave = totalsum/totaln;
        if(ave>max) max = ave;
        return new Item(totaln,totalsum);
    }
}
