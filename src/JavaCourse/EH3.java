package JavaCourse;

public class EH3 {

	public static void main(String[] args) {
	String s = "selenium";
	try {
		int a = Integer.parseInt(s);
	} catch (NumberFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
System.out.println("Exception Handled");
	}

}
