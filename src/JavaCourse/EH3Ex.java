package JavaCourse;

public class EH3Ex {

	public static void main(String[] args) {
		int i = 6;
		
		try {
			String s = String.valueOf(i);
		} catch (Exception e) {
		System.out.println(e);
			e.printStackTrace();
		}
System.out.println("Exception Handled");
	}

}
