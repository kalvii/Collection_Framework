package listInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class StudentName {
	
	public static void main(String[] args)
	{
		
	List<String> str=new ArrayList<>();
	str.add("Ramu");
	str.add("Rohit");
	str.add("Tanya");
	str.add("Kaplesh");
	System.out.println(str);
	for(int i=0;i<str.size();i++)
	{
		String str2=str.get(i);
		System.out.println(str2);
	}
	str.add(1, "Rai");
	str.add(3, "Kumar");
	str.add(5, "Singh");
	str.add(7, "Patel");
	Collections.addAll(str, "RamLal","Kanhaiya","Mohit","Rakesh");
	for(int i=0;i<str.size();i++)
	{
		String str2=str.get(i);
		System.out.println("After adding element"+" "+str2);
	}
	//System.out.println(str.get(3));
	//str.remove(3);
	for(int i=0;i<str.size();i++)
	{
		String str2=str.get(i);
		System.out.println(i+" "+str2);
	}
	System.out.println(str.contains("Rakesh"));
	Collections.sort(str);
	System.out.println(str);
	Iterator itr=str.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	
	
	
	}

}
