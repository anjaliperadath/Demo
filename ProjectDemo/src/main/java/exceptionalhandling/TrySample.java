package exceptionalhandling;

public class TrySample {

	public static void main(String[] args) {
		 int a=10;//simply we gave
		 int b=20;
		 try//used to enclose the code that might throw an exception
		 {
			 int result=50/0; 
		 }
		 catch (ArithmeticException e)//try is always followed by catch or finally//All exception names starts with capital
		 {
			System.out.println("Division by zero is not possible"); //whatever we print will come
		 }
		System.out.println("Rest of the codes"); //code to be executed after the exception 

	}

}
