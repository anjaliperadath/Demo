package Polymorphism;

public class Offseason extends Onseason {

	public static void main(String[] args) {
		Onseason obj=new Offseason();
		obj.rate(2000, 3000, 1000);//calling methods of parent class
		obj.discount();//calling methods of parent class
	}
   
	public void discount()
	{
    D= total-(total*0.15);//15% discount
	System.out.println(D);//Offseason discoint
	super.discount();//Onseason discount
	}
}
