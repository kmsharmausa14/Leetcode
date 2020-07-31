package Nonleetcode;

public class EntityOwnership {
	Node root; 
	  
	EntityOwnership() 
    { 
        root = null; 
    } 
	public static void main(String[] args) {
		EntityOwnership tree = new EntityOwnership(); 
        tree.root = new Node('A',100); 
        tree.root.left = new Node('B',50); 
        tree.root.right = new Node('C',33); 
        tree.root.left.left = new Node('D',50); 
        tree.root.left.right = new Node('F',30);
        tree.root.right.right = new Node('E',10); 
	}

}

class Node 
{ 
    char key; 
    Node left, right; 
    int percent;
    
    public Node(char item,int percentage) 
    { 
        key = item; 
        left = right = null; 
        percent = percentage;        
    } 
} 