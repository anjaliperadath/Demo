//super class use 3
//used to invoke immediate parent class constructor
package SuperSample;

public class Jam extends Bread {

	public static void main(String[] args) {
	Jam obj=new Jam();
	}

	Jam()
	{
		super(2);//to invoke immediate before class constructor, since it is parameterized, pass parameter
		System.out.println("yummy");
	}
	
}
