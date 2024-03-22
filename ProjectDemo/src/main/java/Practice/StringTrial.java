package Practice;

public class StringTrial {

	public static void main(String[] args) {
		String s1="Anjali,is,huhu";
		String s2="GirijaRamki";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.length());
		
		System.out.println(s2.length());
		System.out.println(s1.concat(s2));
		System.out.println(s2.concat(s1));
		System.out.println(s1.toLowerCase());
		System.out.println(s2.toUpperCase());
		System.out.println(s2.contains("a"));
		System.out.println(s1.charAt(5));
		System.out.println(s1.replace("j","n"));
		System.out.println(s2.substring(0, 2));
		String arr[]=s1.split(",");
		for(String i:arr)
		{
			System.out.print(i);
		}
	}

}
