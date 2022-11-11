package CollectionFramework;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

import ComparatorusingObjects.Employee;

public class PriorityQueuePrinting implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer i=(Integer)o1;
		Integer i1=(Integer)o2;
		
		if(i>i1)
		{
			return 1;
		}
		else if(i<i1)
		{
			return -1;
		}
		return 0;
	}
	
	
	public static void main(String[] args)
	{
		Queue q=new PriorityQueue<>(new PriorityQueuePrinting());
		q.offer(12);
		q.offer(21);
		q.offer(65);
		q.offer(37);
		
		System.out.println(q);
		
	System.out.println(q.poll());
	System.out.println(q.peek());
	}
}
	
	
	
	


