package Medium325Onwards;
//import Medium325Onwards.Node;
//510
public class InorderSuccessorinBST2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Node inorderSuccessor(Node x)
	{
		Node result = null;
		
		//case 1: right child is not null -> go down to get the next
		Node p = x.right;
		while(p!=null)
		{
			result=p;
			p=p.left;
		}
		
		if(result!=null)
			return result;
		//case 2: right child is null -> go up to the parent, 
		  //until the node is a left child, return the parent
		p=x;
		while(p!=null)
		{
			if(p.parent!=null && p.parent.left==p)
				return p.parent;
			p=p.parent;
		}
		return null;
	}
	
}
