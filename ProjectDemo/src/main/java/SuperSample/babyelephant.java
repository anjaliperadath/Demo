//super class use 2
//used to invoke immediate parent class instance method
//if parent class and child class have same method name ie method overridden(2 different class having same method name)
package SuperSample;

public class babyelephant extends animal {

	public static void main(String[] args) {
	babyelephant obj=new babyelephant();
	obj.print();	
	}
	
	public void makeSound()
	{
		System.out.println("baaaa");
		
	}
   public void print()
   {
	   makeSound();//to print this class method
	   super.makeSound();//to print immediate before class method of same name
   }

}
