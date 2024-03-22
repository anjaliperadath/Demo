//Hierarchical Inheritance
package Inheritance;

public class Cat extends Animal{

	public static void main(String[] args) {
	Cat obj=new Cat();
    obj.sound();
    obj.eat();
    obj.catNoise();
	}

	public void catNoise()
	{
		System.out.println("Meow");
	}
	
}
