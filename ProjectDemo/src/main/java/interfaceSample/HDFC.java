package interfaceSample;
import java.util.Scanner;
public class HDFC implements RBI {

	public static void main(String[] args) {
		RBI obj=new HDFC();
		obj.recurringDeposit();
	}
	int totalamount;
    int principalamount;
    int duration;
    int n=5;
	public void recurringDeposit()
	{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the principalamount");
	principalamount=input.nextInt();
	System.out.println("Enter the duration");
	duration=input.nextInt();
	totalamount=principalamount*(1+RATE/100)^(n*duration);
	System.out.println(totalamount); 

	}	
}
