package JavaCourse;

public class IfElseIf {

	public static void main(String[] args) {
		int a = 1000;
		int b = 1000;
		//a =a/2;
		
		if(a > b) {
			System.out.println("a is greater than b");
		}
		else if (b > a) {
			System.out.println("b is greater than a");
		}
		else if(a == b) {
			System.out.println("a & b both are equal");
		}
	}

}
