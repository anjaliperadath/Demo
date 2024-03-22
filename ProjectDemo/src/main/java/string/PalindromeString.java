package string;

public class PalindromeString {

	public static void main(String[] args) {
	PalindromeString obj= new PalindromeString();
	obj.pali("java");
	obj.pali("malayalam");
			
}
	public void pali(String str)
	{
		StringBuilder str1=new StringBuilder(str);//string does not support reverse so, a method is created to assign reverse to stringbuilder   
		String reverse= str1.reverse().toString();//toString is used to convert stringbuilder to string
		//reverse operation over and reverse obtained
		//to check reverse = str
		boolean flag=reverse.equalsIgnoreCase(str);//equalsIgnoreCase used to neglet uppercase/lowercase 				
		if(flag)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
	}
	
}