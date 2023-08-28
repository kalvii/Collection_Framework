package listInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AList {

	public static void main(String[] args) {
		List<Integer> al=new ArrayList<>();
		al.add(9);
		al.add(7);
		al.add(4);
		al.add(3);
		al.add(7);
//		System.out.println(al);
//		al.set(1, 5);
//		System.out.println(al);
		
		
		System.out.println("Before sorting element :"+al);
		//al.indexOf(2);
		System.out.println("First occrence :"+al.indexOf(7));
		System.out.println("Last occrence :"+al.lastIndexOf(7));
		al.add(1, 20);
		al.add(0, 20);
		Collections.addAll(al, 34,32,65);
		System.out.println("After adding element :"+al);
		Collections.sort(al);
		System.out.println("after sorting elements :"+al );
		
		System.out.println("conatain elements :"+al.contains(7));
		System.out.println("Min elemnet in al :"+Collections.min(al));
		System.out.println("Max Element in al :"+Collections.max(al));
		

	}

}
