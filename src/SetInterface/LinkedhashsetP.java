package SetInterface;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedhashsetP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		LinkedHashSet<String> lset=new LinkedHashSet<String>();
		lset.add("One");
		lset.add("Two");
		lset.add("Three");
		lset.add("Four");
		lset.add("Five");
		lset.add("Six");
		for(String l1:lset)
		{
			System.out.println("LinkedHashSet Example :"+l1);
		}
		Iterator<String> ite=lset.iterator();
		while((ite.hasNext())) {
			System.out.println(ite.next());
		}
	}

}
