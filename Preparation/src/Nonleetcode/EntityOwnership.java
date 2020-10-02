package Nonleetcode;
import java.util.*;
public class EntityOwnership {
	Node root;	  
	EntityOwnership(){ 
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
        tree.root.left.left.left = new Node('G',10);
        Map<Character, List<Couple>> map = new HashMap<>();
        tree.bfs(tree.root,map);        
	}	
	public void bfs(Node temp,Map<Character, List<Couple>> map)
	{
		EntityOwnership tree = new EntityOwnership();
		Queue<Node> nodes = new LinkedList<>();
		Queue<Node> queue = new LinkedList<>();
		
		nodes.add(temp);
		queue.add(temp);
		
		while(!queue.isEmpty())
		{
			int size = queue.size();
			for(int i=0;i<size;i++)
			{
				Node parent = queue.poll();
				
				if(parent.left!=null)
				{
					nodes.add(parent.left);
					queue.add(parent.left);
				}
				if(parent.right!=null)
				{
					nodes.add(parent.right);
					queue.add(parent.right);
				}
			}
		}
		
		for(Node node : nodes)
		{
			Node root_node = node;
			char root_letter = node.key;
			
			tree.dfs(root_letter,root_node.left,100.0,map);
			tree.dfs(root_letter,root_node.right,100.0,map);
		}
		
		for(Map.Entry<Character, List<Couple>> map1 : map.entrySet())
		{
			char ch = map1.getKey();
			List<Couple> list = map1.getValue();
			for(Couple c : list)
			{
				System.out.println(ch + "  "+ c.x + " " + c.y);
			}
		}		
	}	
	public void dfs(char root_letter,Node root_node,double val,Map<Character, List<Couple>> map)
	{
		if(root_node==null)
			return;
		
		double new_val = root_node.percent * val * 0.01 ;
		
		if(map.containsKey(root_letter))
			map.get(root_letter).add(new Couple(root_node.key,new_val));
		else
		{
			map.put(root_letter,new ArrayList<>());
			map.get(root_letter).add(new Couple(root_node.key,new_val));
		}			
		
		if(root_node.left!=null)
			dfs(root_letter,root_node.left,new_val,map);
		
		if(root_node.right!=null)
			dfs(root_letter,root_node.right,new_val,map);
	}
}
class Node{ 
    char key; 
    Node left, right; 
    double percent;    
    public Node(char item,int percentage) { 
        key = item; 
        left = right = null; 
        percent = percentage;        
    } 
}
class Couple{
	char x;
	double y;	
	public Couple(char key, double new_val) {
		x = key;
		y = new_val;
	}	
}
