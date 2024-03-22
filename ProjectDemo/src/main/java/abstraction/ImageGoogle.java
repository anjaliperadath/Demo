//it is also hierarchical inheritance
package abstraction;

public class ImageGoogle extends AbstractionDemo {

	public static void main(String[] args) {
		ImageGoogle obj=new ImageGoogle();//object of ImageGoogle class 
		obj.search();
		VideoGoogle obj1= new VideoGoogle();//object of VideoGoogle class
		obj1.search();

	}
	public void search()//implementation of abstract method
	{
		System.out.println("Image Searching");
	}
}
