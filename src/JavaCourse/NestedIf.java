package JavaCourse;

public class NestedIf {

	public static void main(String[] args) {
		int age = 30;
		int weight = 70;
		
		//outer if block
		
		if (age>20) {
			
			if(weight>50) {
				
				System.out.println("Eligible");
			}
			else {
				
				System.out.println("Not Eligible");
			}
		}
			else {
				System.out.println("age is not greater than 20");
			}
		}

	}


