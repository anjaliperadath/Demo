//abstraction using interface
package interfaceSample;

public class InterfaceClass implements SampleInterface {//use implements instead of extends

	public static void main(String[] args) {
	SampleInterface obj=new InterfaceClass();//parent obj=new child();
	obj.show();
	}
	
	public void show()//as to implement as can't implement in interface class
	{
		System.out.println(MAX_VALUE);
		System.out.println("Implementation of abstraction using interface");
	}
}
