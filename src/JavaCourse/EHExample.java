package JavaCourse;

public class EHExample {

	public static void main(String[] args) {
		
		
		try {
        int k = 6/0;
		}
		
		catch(ArithmeticException a) {
			a.printStackTrace();
			System.out.println(a);
		}
		catch(ArrayIndexOutOfBoundsException c) {
			System.out.println(c);
		}
		catch(NullPointerException n) {
			System.out.println(n);
		}
		catch(Exception e){
			
			System.out.println(e);
		}
		System.out.println("Exception Handled");
		
	}

}
