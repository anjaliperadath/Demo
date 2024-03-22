//Hybrid Inheritance
package Inheritance;

public class puppy extends Dog{

	public static void main(String[] args) {
	 puppy obj=new puppy();
	 obj.bark();
	 obj.eat();
	 obj.jump();
	}

	public void jump()
	{
		System.out.println("Jumping");
	}
	
}

