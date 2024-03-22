//Multiple Inheritance
package interfaceSample;

public class Demo implements Interface1,Interface2{//to obtain multiple Inheritance implement both the interfaces

	public static void main(String[] args) {
		Demo obj=new Demo();//create object of class 
		obj.print();//call the implementation methods of interfaces
		obj.display();
	}

	public void print()
	{
		System.out.println(A);
		System.out.println(NAME);
		System.out.println("Implementation of Interface 1");
	}
	
	public void display()
	{
		System.out.println(B);
		System.out.println(S);
		System.out.println("Implementaion of Interface 2");
	}
}
