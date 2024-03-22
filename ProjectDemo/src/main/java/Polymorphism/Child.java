//Polymorphism upcasting 

package Polymorphism;

public class Child extends Human{
	public static void main(String[] args) {
		Human obj=new Child();//reference variable of parent class refers to child class object
		obj.walk();//can call method of parent class only it overrides and comes here as it is extended
		//obj.eat();//only same name of child and parent method will be obtained else will not get child method if it is different 
		obj.sleep();//in upcasting all parent method will get here
		Child obj2=new Child();
		obj2.eat();//if we want to get child then create object for child again and call it only then we will get
	}
	
	public void walk()
	{
		//super.walk();
		System.out.println("Child Walking");//then the child class is run
	}
	
   public void eat()
   {
	 System.out.println("Child eating");  
   }
   
   
}
