package string;

public class Stringnewkeyword1 {

	public static void main(String[] args) {
		String str=new String("HelloWorld");//using new keyword
		String str2=new String("Welcome");//using new keyword
		System.out.println(str==str2);
		System.out.println(str.equals(str2));
		
		int l=str.length();//to initialize the length into variable l
		
		System.out.println(l);//to find the length of the string	
		System.out.println(str+str2);
		
		System.out.println(str);	
		System.out.println(str.toLowerCase());
		
		System.out.println(str.toUpperCase());
		
		System.out.println(str.contains("o"));
		
		System.out.println(str.charAt(0));//index 0th index is H 1st is e
		
		System.out.println(str.replace('H', 'K'));
		
		System.out.println(str.substring(0, 4));//to obtain the letters needed ie trim
		
		String arr[]=str.split("e");//string cannot be directly printed so we give inside for each loop
		                            //split means that letter alone is skipped rest letters before and after will be printed.here "e" is skipped
		                            //split before e and after e without space
		for(String i:arr) {
			System.out.print(i);	
		}
	}
}
