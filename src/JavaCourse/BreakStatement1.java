package JavaCourse;

public class BreakStatement1 {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			
	
		for(int j=0; j<5; j++) {
			

			System.out.println(i + "  "+ j);
			
			if(i==4 && j==4) {
			
				break;
			}
			
		}
		System.out.println("control came out from inner loop");
		}
  
	}

}
