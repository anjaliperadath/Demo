//abstraction
package abstraction;

public class AbstractionDemo extends AbstractionSample {//to obtain the details of abstract class

	public static void main(String[] args) {
		AbstractionDemo obj=new AbstractionDemo();//as we cannot create object in abstract class
		obj.print();
		obj.display();
		obj.show();
		
	}

	public void print()//implementation of abstract method:it is done by giving same method name
	{
		System.out.println("Implementation of abstract method");
	}
	
	public void show()//simply another method in this class
	{
		System.out.println("Showing details");
	}
}
