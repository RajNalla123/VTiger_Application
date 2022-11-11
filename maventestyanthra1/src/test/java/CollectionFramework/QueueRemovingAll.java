package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueRemovingAll {

	public static void main(String[] args) {
		
		Queue q=new LinkedList<>();
		q.offer(12);
		q.offer(65);
		q.offer(45);
		q.offer(52);
		System.out.println(q);
		
		while(!q.isEmpty())
		{
			System.out.println(q.poll());
		}
		
		System.out.println(q);
		
		

	}

}
