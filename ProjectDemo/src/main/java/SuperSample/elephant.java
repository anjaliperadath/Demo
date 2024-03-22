//super class use 1
//used to refer immediate parent class instance variable 
package SuperSample;

public class elephant extends animal {

	public static void main(String[] args) {	
		elephant obj=new elephant();
		obj.makeSound();
		obj.print();
	}
	
   String sound= "gur";//variable 
   public void makeSound()
   {
	   System.out.println("gurrrrrrrrrrr");
   }
   
   public void print()
   {
	   System.out.println(sound);//when we give only sound we get the variable of this class
	   System.out.println(super.sound);//when we give super.sound we get the immediate before class variable 
   }
}
