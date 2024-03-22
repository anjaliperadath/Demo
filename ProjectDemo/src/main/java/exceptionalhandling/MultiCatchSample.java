package exceptionalhandling;

public class MultiCatchSample {

	public static void main(String[] args) {
		 try//used to enclose the code that might throw an exception
		 {
			 
			 int arr[]=new int[10];//2nd exception
			 arr[15]=45;
			 int result=50/0; //1st exception
		 }
		 
		 catch (ArithmeticException e)//1st exception//error as parent should be last
		 {
			System.out.println(e); //whatever we print will come
		 }
		 
		 catch (ArrayIndexOutOfBoundsException e)//2nd exception
		 {
			System.out.println(e); //whatever we print will come
		 }
		 
		 catch(Exception e)//parent exception//if we dont give the exception it will come automatically
		 {
			System.out.println(e);
		 }
		  
        finally//should be always given last
        {
        	System.out.println("finally block will always be executed");
        }
		 System.out.println("Rest of the codes"); //code to be executed after the exception
	}
}
