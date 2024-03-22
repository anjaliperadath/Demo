package abstraction;

public class Contractor extends Employee {

	public static void main(String[] args) {
		Contractor obj=new Contractor();
		obj.calculateSalary();
        FullTimeEmployee obj1=new FullTimeEmployee();
        obj1.calculateSalary();
	}
    int payment=300;
    int working=12;
    
	public void calculateSalary()
	{
		int salary=payment*working;
		System.out.println(salary);
	}
}
