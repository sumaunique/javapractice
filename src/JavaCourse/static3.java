package JavaCourse;

public class static3 {
	int roll;
	String name;
	static String college = "IIT bombay";
	
	//constructor
	static3(int r, String n){
		roll  = r;
		name = n;
	}
public void getResult() {
  System.out.println(roll+ "  " + name + "  " + college);	  
  }
}
