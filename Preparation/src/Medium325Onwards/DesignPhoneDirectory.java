package Medium325Onwards;

import java.util.*;

public class DesignPhoneDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	int max;
	HashSet<Integer> set;
	LinkedList<Integer> queue;
	
	public void PhoneDirectory(int maxNumbers)
	{
		set= new HashSet<Integer>();
		queue = new LinkedList<Integer>();
		for(int i=0;i<maxNumbers;i++)
			queue.offer(i);
		max=maxNumbers-1;
	}
	
	public int get()
	{
		if(queue.isEmpty())
			return -1;
		int e=queue.poll();
		set.add(e);
		return e;
	}
	
	public boolean check(int number)
	{
		return  !set.contains(number) && number<=max;
	}
	
	public void release(int number)
	{
		if(set.contains(number))
		{
			set.remove(number);
			queue.offer(number);
		}
	}
}
