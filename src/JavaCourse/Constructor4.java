package JavaCourse;

public class Constructor4 {

	Constructor4(int a, int b){
		System.out.println("Int type constructor" );
	}
	Constructor4(int a, String g){
		System.out.println("Mixed type constructor");
	}
	public static void main(String[] args) {
		Constructor4 c4 = new Constructor4(2,3);
		Constructor4 c5 = new Constructor4(6,"suma");

	}

}
