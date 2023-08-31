package JavaCourse;

public class Abstraction2 extends Abstract1{

	void eat() {
		System.out.println("eat");
	}
	
	public static void main(String[] args) {
		
   Abstraction2 a2 = new Abstraction2();
    
   a2.eat();
   a2.a();
   
	}

}
