package JavaCourse;

public class TypeCastingNarrowing2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//double to int-->int x = (int)y
//string to int-->int x = Integer.parseint(y)
// int to string--> string x = String.valueOf(y)
		
		double b=10.0;
	
		String s = "10";
		
		int i = 10;
		
		int j = (int)b;
		
		int k = Integer.parseInt(s);
		
		String t=String.valueOf(i);
		
		System.out.println(b);
		System.out.println(j);

		System.out.println(k);
		System.out.println(t);
	}

}
