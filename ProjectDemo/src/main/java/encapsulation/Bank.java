package encapsulation;

public class Bank {

	
   private int pin;
   public int getPin() {//getter
	return pin;
}
   
    public void setPin(int pin) {//setter
	this.pin = pin;
}
    
   public void valid()//to check whether pin is valid
   {
	if(pin==1001||pin==1234||pin==1212)
	{
		System.out.println("Pin Valid");
	}
	else
	{
		System.out.println("Pin invalid");
	}
   }
   	
}
