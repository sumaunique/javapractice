package JavaCourse;

public class Array2 {

	public static void main(String[] args) {
		
		//Defining Array
		
		int a[] = {1,2,3,4,5,6,7,8,9};
		String s[] = {"suma","mani","deava", "laahi"};
		Object h[] = {9,9.0,"suma",7/8,7<9};
		// changing array value during run time
		
		a[0]= 0;
		//printing array length
		
		System.out.println(a.length);
		System.out.println(s.length);
		System.out.println(h.length);
		System.out.println(a[0]);
		

	}

}
