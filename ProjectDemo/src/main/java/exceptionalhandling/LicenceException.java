//Custom Exception:to create our wish exception
package exceptionalhandling;

public class LicenceException extends Exception {//exception is inbuilt parent exception 

	public LicenceException(String s)//string as we give the arithmetic exception etc//constructor
	{
		super(s);//to get the exception from parent class exception //to get string of parent class
	}
}
