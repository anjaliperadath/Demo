package abstraction;

public class FullTimeEmployee extends Employee {
	
	int payment=350;
	final int working=8;//as constant value
	public void calculateSalary()
	{
		int salary=payment*working;
		System.out.println(salary);	
	}
}
