package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ColorsArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("blue");
		list1.add("green");
		list1.add("red");
		list1.add("black");
		list1.add("white");
		System.out.println(list1);
		
		System.out.println("to retrieve an element at a specified index:");
		System.out.println(list1.get(2));
		
		System.out.println("Iterate through all elements in array list:");
		 Iterator<String> i=list1.iterator();
		    while(i.hasNext())//condition to check whether the next element is there or not
		    {
		    	System.out.println(i.next());//will print the elements
		    }
		
		System.out.println("to remove third element from array list:");
		list1.remove(2);
		System.out.println(list1);
		
		System.out.println("to search an element in array list:");
		System.out.println(list1.contains("blue"));		
	}
}
