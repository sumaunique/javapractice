package JavaCourse;

public class UnaryOperators2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		
		System.out.println(a++);//10,11
		System.out.println(a++ + ++a);//11,12   +  13,13 = 11+13 = 24
		System.out.println(a);//13
		System.out.println(b--);//10,9
		System.out.println(b++ + b--);//9,10 + 10,9 = 9+10 = 19
		System.out.println(b);//9
	}

}
