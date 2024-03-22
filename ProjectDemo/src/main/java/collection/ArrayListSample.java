//ArrayList using wrapper class
package collection;

import java.util.ArrayList;//import class ArrayList

public class ArrayListSample {

	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList();//when Integer datatype is used//Integer,Float,Character etc is called wrapper class
	    list1.add(3);	//list1 is an object
	    list1.add(6);
	    System.out.println(list1);//to print the elements of list1
	    System.out.println(list1.size());//to find length
	    
	    ArrayList<Character> list2=new ArrayList();//Character datatype using wrapperclass
	    list2.add('A');
	    list2.add('B');
	    list2.add('C');
	    System.out.println(list2);   
	    System.out.println(list2.size()); 
	    list2.remove(0);//remove can be done using index only  
	    System.out.println(list2);
	}
}
 

