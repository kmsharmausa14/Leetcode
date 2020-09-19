package Medium573Onwards;
//708
import locked.ListNode;

public class InsertintoaCyclicSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode insert(ListNode node,int x)
	{
		if(node==null)
		{
			node=new ListNode(x);
			node.next=node;
			return node;
		}
		
		ListNode head=node;
		while(node!=null && node.next!=null)
		{
			if(node.val<node.next.val)
			{
				if(node.val<=x && x<=node.next.val)
				{
					insertNode(node,x);
					break;
				}
			}
			else if(node.val>node.next.val)
			{
				if(x>node.val || x<node.next.val)
				{
					insertNode(node,x);
					break;
				}
			}
			else
			{
				if(node.next==head)
				{
					insertNode(node,x);
					break;
				}
			}
			node=node.next;
		}
		return head;
	}
	
	public void insertNode(ListNode node,int x)
	{
		ListNode newNode = new ListNode(x);
		newNode.next=node.next;
		node.next=newNode;
	}
}
