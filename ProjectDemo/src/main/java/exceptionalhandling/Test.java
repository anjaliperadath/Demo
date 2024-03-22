//Custom Exception it is done like checked as parent is checked(exception)
package exceptionalhandling;

public class Test {

	public static void main(String[] args) {
		try {
			validate(15);//as parent is checked when we typed validate try catch came inbuilt
		} catch (LicenceException e) {
			// TODO Auto-generated catch block
			System.out.println(e);//catch syntax
		}
	}

	public static void validate(int age) throws LicenceException//checked exception
	{
		if(age<18)
		{
			throw new LicenceException("Not Eligible");//throw given inside method
		}
		else
		{
			System.out.println("Licence Approved");
		}
	}
	
}
