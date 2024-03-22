package Inheritance;

import java.util.Scanner;

public class BasicPay {
	int basicpay;
	int deduction;
	int bonus;
	
	
	public void Details() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the basic pay");
    basicpay=input.nextInt();
    System.out.println("Enter the deduction");
    deduction =input.nextInt();
    System.out.println("Enter the bonus");
    bonus =input.nextInt();
   
    
	}

}//here no execution so main method removed.
