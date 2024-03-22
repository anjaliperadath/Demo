//Single Inheritance
package Inheritance;

public class Dog extends Animal {
	

	public static void main(String[] args) {
	Dog obj=new Dog();
	System.out.println(obj.color);//call in printing statement as variable
	obj.eat();
	obj.bark();
	obj.sound();
	}
	
	public void bark()
	{
		System.out.println("Barking");
	}

}
