package encapsulation;

public class GetterSetter {

 private String name;//declare instance variable as private
 private int rollno;//declare instance variable as private
 private String college;//declare instance variable as private
 
public String getName() {//automatically getter
	return name;//the setter is returned when it is given automatically
}
public void setName(String name) {//automatically setter
	this.name = name;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getCollege() {
	return college;
}
public void setCollege(String college) {
	this.college = college;
}
}
