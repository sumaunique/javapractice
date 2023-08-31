package JavaCourse;

public class Constructor2 {
int id ;
String name;
String address;
//default constructor
Constructor2(){
	System.out.println("Hello Default constructor");
}
//parametirised constructor
Constructor2(int a, String d, String b){
	this.id = a;
	name =d;
	address = b;
}
//non static method
public void displayinfo() {
	System.out.println(id + "  " +name+ "  "  + address);
}
	public static void main(String[] args) {
		
		Constructor2 c2 = new Constructor2();  
		Constructor2 c3 = new Constructor2(1,"JOhn","England");
				c3.displayinfo();
				
		Constructor2 c4 = new Constructor2(2,"JOhaugustus","England");
		          c4.displayinfo();
		

	}

}
