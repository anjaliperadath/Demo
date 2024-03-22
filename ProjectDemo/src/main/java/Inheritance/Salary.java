package Inheritance;

public class Salary extends hra{

	public static void main(String[] args) {
		Salary obj=new Salary();
		
		obj.Details();
		obj.hraPf();
		obj.salary();
		obj.display();

	}
    double total;
    
	public void salary()
	{
		total= basicpay+hra-pf-deduction+bonus;
	}
	
	public void display()
	{
		System.out.println(basicpay);
		System.out.println(deduction);
		System.out.println(hra);
		System.out.println(pf);
		System.out.println(total);
		
	}
	
	
}
