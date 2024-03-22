//unchecked exception
package exceptionalhandling;

public class ThrowsSample {

	public static void main(String[] args) {
	check();//invoking the static method	
	}

	public static void check()throws ArithmeticException//unchecked Exception//throws is with signature
	{
		throw new ArithmeticException("Exception Occured");//throw is given within method
	}
}
