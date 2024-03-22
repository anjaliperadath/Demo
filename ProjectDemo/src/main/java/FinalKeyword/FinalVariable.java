//Final keyoword Variable
package FinalKeyword;

public class FinalVariable {

	public static void main(String[] args) {
		
	}
	
	final int a=45;
	final int b;//blank final

	FinalVariable()//if we need to execute, create obj in main method and call constructor
	{
	  b=456;//if we give blank final then it can be given value only in constructor
	  //a=2;since a is final its value cannot be changed, already a has a value 45 so error comes
	}
	
}
