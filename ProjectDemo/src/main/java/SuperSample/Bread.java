//super class use 3
//used to invoke immediate parent class constructor
package SuperSample;

public class Bread {

	public static void main(String[] args) {
		
	}

	Bread()
	{
		System.out.println("Nutella");
	}
	
	Bread(int id)
	{
		this();//to invoke current class non parameterized constructor
		System.out.println(id);
	}
	
}
