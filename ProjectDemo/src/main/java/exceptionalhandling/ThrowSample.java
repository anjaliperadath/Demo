package exceptionalhandling;

public class ThrowSample {

	public static void main(String[] args) {
		try {
			ThrowSample.sum(50, 20);//calling static method like this or simply sum(50,20);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
		System.out.println("Final block");	//simply gave
	}
	}
   
	public static void sum(int a,int b)//static or instance method can be given
	{
		int s=a+b;
		if(s>50)
	{
	throw new ArithmeticException("sum is greater than 50");//whatever we want to throw
	}
	else
	{
		System.out.println("Sum is less than 50");
	}
	}
}
