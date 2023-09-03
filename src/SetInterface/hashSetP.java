package SetInterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashSetP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hashSet=new HashSet<String>();
		hashSet.add("One");
		hashSet.add("Two");
		hashSet.add("Three");
		hashSet.add("Four");
		hashSet.add("Five");
		hashSet.add("Six");
		hashSet.add("Six");
		//System.out.println("list of number : "+hashSet);
		for(String b:hashSet)
			{System.out.println(b);}
		System.out.println("-------------------------------------------------------");
		Iterator<String> it=hashSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		System.out.println(hashSet.contains("Six"));
		
		HashSet<String> cloneset=new HashSet<String>();
		cloneset=(HashSet)hashSet.clone();
		System.out.println("Clone Set : "+ cloneset);

	}

}
