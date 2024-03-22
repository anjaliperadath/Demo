package SuperSample;

public class Div extends AddRes {

	public static void main(String[] args) {
		Div obj=new Div();
		obj.display();
	}
    
	public void display()
	{
		super.sum();
		
	if (total%10==0)
	{
	System.out.println("Divisible by 10");
	}
	else
	{
	System.out.println("Not Divisible by 10");
	}
	}
}
//no need to print the result.only check whether divisible or not