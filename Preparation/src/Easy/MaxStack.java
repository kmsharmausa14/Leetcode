package Easy;
//716
import java.util.*;

public class MaxStack {

	public static void main(String[] args) {
		
	}

	Stack<Integer> stack;
	Stack<Integer> maxStack;
	
	public MaxStack()
	{
		stack = new Stack();
		maxStack = new Stack();
	}
	
	public void push(int x)
	{
		int max=maxStack.isEmpty()?x:maxStack.peek();
		maxStack.push(max>x?max:x);
		stack.push(x);
	}
	
	public int pop()
	{
		maxStack.pop();
		return stack.pop();
	}
	
	public int top()
	{
		return stack.peek();
	}
	
	public int peekMax()
	{
		return maxStack.peek();
	}
	
	public int popMax()
	{
		return maxStack.pop();
	}
}
