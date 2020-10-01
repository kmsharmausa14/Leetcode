package Medium325Onwards;
//536
public class ConstructBinaryTreefromString {

	public static void main(String[] args) {
		str2tree("4(2(3)(1))(6(5))");
	}

	public static TreeNode str2tree(String s)
	{
		if(s==null || s.length()==0)
			return null;
		int firstParen = s.indexOf("(");
		int val = firstParen==-1?Integer.parseInt(s):Integer.parseInt(s.substring(0,firstParen));
		TreeNode cur = new TreeNode (val);
		
		if(firstParen==-1)
			return cur;
		int start=firstParen,leftParentCount=0;
		for(int i=start;i<s.length();i++)
		{
			if(s.charAt(i)=='(')
				leftParentCount++;
			else if(s.charAt(i)==')')
				leftParentCount--;
			if(leftParentCount==0 && start==firstParen)
			{
				cur.left=str2tree(s.substring(start+1,i));
				start=i+1;
			}
			else if(leftParentCount==0)
				cur.right=str2tree(s.substring(start+1, i));
		}
		return cur;
	}
}
