package encapsulation;

public class GetterCalling {

	public static void main(String[] args) {
		GetterSetter obj=new GetterSetter();//object of required class is created using local aggregation
		
		obj.setName("Anjali");//as different parameterized method are given
		obj.setRollno(10);
		obj.setCollege("Nehru");
		
		System.out.println(obj.getName());//since we returned value, so the getter should be given inside print statement
		System.out.println(obj.getRollno());
		System.out.println(obj.getCollege());

	}

}
