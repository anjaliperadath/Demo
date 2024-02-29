package string;

public class StringBuilderSample {

	public static void main(String[] args) {
	StringBuilder str=new StringBuilder("HelloWorld");
	StringBuilder str2=new StringBuilder("Welcome");
	System.out.println(str.length());
	System.out.println(str2.length());//to get length
	System.out.println(str.append(str2));//combine or add 
    System.out.println(str.equals(str2));//to check equal or not
    System.out.println(str.deleteCharAt(4));//to delete 4th index value or 4th element
    System.out.println(str.delete(5, 7));//to delete 6th and 7th element ie 5 not included
    System.out.println(str.insert(0, 'a'));//in the 0th index character 'a' will be inserted
    System.out.println(str.reverse());//to find reverse
	}

}
