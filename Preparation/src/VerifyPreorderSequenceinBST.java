
public class VerifyPreorderSequenceinBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] y = new int[] {5,2,1,3,6};
		boolean u=verifyPreorder(y);
	}
	
	public static boolean verifyPreorder(int[] preorder)
	{
		int low = Integer.MIN_VALUE, i=-1;
		for(int p:preorder)
		{
			if(p<low)
				return false;
			while(i>=0 && p>preorder[i])
				low=preorder[i--];
			preorder[++i]=p;
		}
		return true;
	}

}
