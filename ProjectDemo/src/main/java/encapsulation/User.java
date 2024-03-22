
package encapsulation;
import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your pin");
		int pin=input.nextInt();
		Bank obj=new Bank();
		obj.setPin(pin);//give pin as Scanner class is used 
		System.out.println(obj.getPin());
		obj.valid();

	}
}
