package exceptionalhandling;

public class BasicTry {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int result=50/0;//this is an exception as division by zero is a runtime error
		System.out.println("Rest of the codes");//code to be executed after the exception 
	}

}
