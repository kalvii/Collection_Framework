package QueueP;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityDequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> qu=new PriorityQueue<String>();
		qu.add("X");
		qu.add("E");
		qu.add("C");
		qu.add("T");
		qu.add("N");
		qu.add("Q");
		qu.add("A");
		qu.add("B");
//		Iterator<String> itr=qu.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		System.out.println(qu.element());
		//System.out.println(qu.remove());
		System.out.println(qu);

	}

}
