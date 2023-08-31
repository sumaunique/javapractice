package JavaCourse;

public class LogicalOperators {

	public static void main(String[] args) {
		int a = 10;
		
		int c = 15;
		int b = 20;
		
		System.out.println(a>c && a<c);//logical operator,false
		System.out.println(a>c && a>c);//logical operator,false
		System.out.println(a<c && a<c);//logical operator,true
		System.out.println(a<c && a<c);//logical operator,true
		System.out.println(a>c && ++a<c);//logical operator,true
		System.out.println(a);
		System.out.println(b);

		
		// Logical operators doesn't check second condition if first condition is false
		
		
		System.out.println(a>c & a<c);//Bitwise operator,false
		System.out.println(a>c & a>c);//Bitwise operator,true
		System.out.println(a<c & ++a<c);//Bitwise operator,true
		System.out.println(a);
		
  //Bitwise operators check both the conditions if first condition is true or false

	}

}
