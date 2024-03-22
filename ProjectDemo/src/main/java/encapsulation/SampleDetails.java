package encapsulation;

public class SampleDetails {

   private String name;//instance variable declared as private
   private long accountno;//instance variable declared as private
   private String email;//instance variable declared as private
  
   public void setter(String name,long accountno,String email)//we give setter manually
   {
	this.name=name;
	this.accountno=accountno;
	this.email=email;
   }
   
   public void getter()//we give getter manually
   {
	   System.out.println("Name:"+" "+name);
	   System.out.println("Account Number:"+" "+accountno);
	   System.out.println("Email:"+" "+email);
   }
}
