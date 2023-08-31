package JavaCourse;

public class Static7 {

	String a;//global variable
	int b;//global variable
	static int c =4;//static variable
	
	//static method
	
	public static void a () {
		System.out.println("Hello Static");
	}
	
	public static void main(String[] args) {
	
		Static7 s7 = new Static7();
		
		s7.a="selenium";
		s7.b= 1;
		//c=10;
		a();
		
		
		System.out.println(s7.a + "  " + s7.b + " " + c);
		
		
	}

}
