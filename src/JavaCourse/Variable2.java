package JavaCourse;

public class Variable2 {

	int b = 10;//global variable
	
	static int c = 5;//static variable
	
	public static void d() {
		int e = 15;
		System.out.println(e);
	}
	public void f() {
		int g = 5;
		System.out.println(g);
	}
	public static void main(String[] args) {
		int a =6;//local  variable
		System.out.println(a);
		
		
		//calling static member
		System.out.println(c);//way--1
		System.out.println(Variable2.c);//way--2
		
		//calling non-static member
		
		Variable2 v = new Variable2();
		System.out.println(v.b);
		Variable2.d();
		d();
	    v.f();
		
			
	}

}
