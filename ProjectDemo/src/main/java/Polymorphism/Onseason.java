package Polymorphism;

public class Onseason {
    
	int total;
	double D;
	
	public void rate(int item1,int item2,int item3)
	{
	total=(item1+item2+item3);
	System.out.println(total);	
	}
	
	public void discount()
	{
    D= total-(total*0.4);//40% discount
	System.out.println(D);
	}
	
}
