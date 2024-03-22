//collection is used to increase the size of array. dont need to mention the size
//List
//Methods of list Interface and ArrayList Class 
package collection;

import java.util.ArrayList;//import ArrayList is a class
import java.util.Collections;
import java.util.Iterator;
import java.util.List;//list is interface

public class ListSample {

	public static void main(String[] args) {
		List<String> list1=new ArrayList();//list interface
	    list1.add("apple");	//list1 is an object
	    list1.add("orange");//.add is used to add the string
	    list1.add("banana");
	    list1.add("grapes");
	    list1.add("kiwi");   
	    list1.add("plum");
	    System.out.println(list1);//to print the elements of list1 
	    
	    System.out.println("to find size:");
	    System.out.println(list1.size());//to find length
	    
	    System.out.println("to remove the element:");
	    list1.remove("apple");//to remove apple can be done by giving that element or index
	    System.out.println(list1);
	    
	    //can be done if Arraylist or List ie my list1 is List and list2 is ArrayList
	    System.out.println("generic arrayList:");
	    ArrayList<String> list2=new ArrayList<String>();//because generic arraylist//with arraylist add <datatype> on both sides
	    list2.add("hi");	//list1 is an object
	    list2.add("hello");//.add is used to add the string
	    list2.add("orange");//give common element
	    list2.add("banana");
	    System.out.println(list2);//to print the elements of list1
	    
	    System.out.println("AddAll:");
	    list2.addAll(list1);//to add list 1 elements to list 2 
	    System.out.println(list2);
	    
	    System.out.println("removeAll:"); 
	    list2.removeAll(list1);//list 1 elements and common elements will be removed 
	    System.out.println(list2);
	    
	    System.out.println("get:");
	    System.out.println(list2.get(1));//to get element of that index
	    
	    System.out.println("set:");
	    list2.set(1,"mango");
	    System.out.println(list2);//used to replace the element at given index 
	    
	    System.out.println("sort:");//to sort the list alphabetic order
	    Collections.sort(list1);//first all uppercase will be taken then only smallercase 
	    System.out.println(list1);
	    
	    System.out.println("print using for loop:");
	    for(int i=0;i<list1.size();i++)
	    {
	    	System.out.println(list1.get(i));//to print the elements of the array using for 
	    }
	    
	    System.out.println("print using foreach:");
	    for(String i:list1)
	    {
	    	System.out.println(i);//to print the elements of the array using foreach
	    }
	    
	    System.out.println("non generic:");
	    ArrayList list3=new ArrayList();//non generic ArrayList
	    list3.add(12);//since it is non generic any time of datatype can be held
	    list3.add("apple");
	    list3.add('c');
	    System.out.println(list3);
	    
	    System.out.println("contains:");//to check whether that element is there
	    System.out.println(list1.contains("orange"));
	    
	    //Iterator
	    System.out.println("Iterator:");//to iterate the elements in the forward direction 
	    Iterator<String> i=list1.iterator();
	    while(i.hasNext())//condition to check whether the next element is there or not
	    {
	    	System.out.println(i.next());//will print the elements
	    }
	    i.remove();//to remove last element using iteration 
	    System.out.println(list1);
	    
	    System.out.println("null values:");//to obtain null values 
	    list2.add(null);//Arraylist contains any number of null values
	    list2.add(null);
	    System.out.println(list2);
	}	
}
