package JavaCourse;

public class EH4 {

	public static void main(String[] args) {
		int a [] = new int [5];
		
		try {
			a[7]=50;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      System.out.println("Exception Handled");
	}

}
