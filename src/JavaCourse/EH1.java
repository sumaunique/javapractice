package JavaCourse;

public class EH1 {

	public static void main(String[] args) {
		
		try {
			int a = 5/0;
		}
		catch(ArithmeticException a  ) {
	      a.printStackTrace();//gives complete exception info
		System.out.println(a);//gives only exception info
				
		}
		catch(NullPointerException n) {
			System.out.println(n);
		}
		catch(ArrayIndexOutOfBoundsException d) {
			System.out.println(d);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Exception handled");
	}
     

}

