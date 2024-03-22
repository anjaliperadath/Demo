//Global aggregation:can print everywhere
package aggregation;

public class Student {
	public static void main(String[] args) {
	Address obj=new Address("Peradath house",432,678631,"Kongad");
	Student obj1=new Student("Anjali",10,obj);//give obj in place of address to get it 
	obj1.display();
	}
	
 String name;
 int rollno;
 Address a;//Classname reference variable
 
 Student(String name,int rollno,Address a)
 {
	 this.name=name;
	 this.rollno=rollno;
	 this.a=a;
 }
	public void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Rollno:"+rollno);
		System.out.println("Housenumber:"+a.housenumber);//reference is given to obtain globally 
		System.out.println("Housename:"+a.housename);
		System.out.println("Pincode:"+a.pincode);
		System.out.println("City:"+a.city);
	}	
}
