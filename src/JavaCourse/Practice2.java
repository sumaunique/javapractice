package JavaCourse;

public class Practice2 extends Practice {
	
	void method1() {
		
		System.out.println("Empty method in practice2  is ecxecuted"); 
		
	}
	
	void method2(int a, int b, int c) {
		
		int d = a+b+c;
		
	}
public static void main(String[] args) {
	Practice p =new Practice();
	
	Practice2 p2 = new Practice2();
	
	
	
	p.method1();
	p.method2(9, 6);
	p2.method1();
	p2.method2(80, 5);
	p.method2(80, 5);
	
	
	
}
}
