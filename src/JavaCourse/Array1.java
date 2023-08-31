package JavaCourse;

public class Array1 {

	public static void main(String[] args) {
	
		//defining an array
	
		int a [] = new int[5];
	//printing length of an array
		
		System.out.println(a.length);
		
	// print default value of an array
		
		for(int i =0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		//assigning values to an array
		a[0] =10;
		a[1] =20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		//a[5] = 60;
		//a[6] =89;
		
		//printing all Array elements
		for (int i = 0; i<a.length; i++) {
			System.out.println(a[i]);
			
		}
		
		
	}

}
