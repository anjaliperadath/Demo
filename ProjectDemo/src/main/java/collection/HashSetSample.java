package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetSample {

	public static void main(String[] args) {
		HashSet<String>s1=new HashSet<String>();//import HashSet by right clicking on error
		s1.add("carrot");
		s1.add("brinjal");
		s1.add("papaya");
		s1.add("papaya");//will not print duplicate element
		System.out.println(s1);
		
		HashSet<String>s2=new HashSet<String>();
		s2.add("beetroot");
		s2.add("pumkin");
		s2.add("radish");
		s2.add("carrot");
		System.out.println(s2);
		
		System.out.println("iterator");
		Iterator<String> i=s1.iterator();//to iterate the elements in the forward direction 
		while(i.hasNext())//condition to check whether the next element is there or not
		{
			System.out.println(i.next());//will print the elements
		}
		
		System.out.println("remove");
		s1.remove("carrot");//to remove can be done by giving that element or index
		System.out.println(s1);
		
		s1.remove(1);
		System.out.println(s1);//it wont work as in Set only removal of elements will work no index
		
		System.out.println("AddALL:");//to add set 1 elements to set 2 
		s2.addAll(s1);
		System.out.println(s2);
		
		System.out.println("RemoveAll:");//list 1 elements and common elements will be removed
		s2.removeAll(s1);
		System.out.println(s2);
		
		 System.out.println("to find size:");
		 System.out.println(s1.size());//to find length
		
		 System.out.println("contains:");//to check whether that element is there
		 System.out.println(s1.contains("brinjal"));
		
		//Collections.sort();not applicable
		 //get();
		 //set();		
	}

}
