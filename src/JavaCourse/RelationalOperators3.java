package JavaCourse;

public class RelationalOperators3 {

	public static void main(String[] args) {
	String s1= "SUMALATHA";
	String s2= "sumalatha";
	
	System.out.println(s1);
	System.out.println(s2);
	 
	//1st way of string comparison 
	
	if(s1==s2) {
		System.out.println("s1 is equal to s2 in 1 st way");
	}
	else {
		System.out.println("s1 is not equal to s2 in 1 st way");
	}

	//2nd way of comparison of string
	
	if(s1.equals(s2)) {
		System.out.println("s1 is equal to s2 in 2 nd  way");
	}
	else {
		System.out.println("s1 is not equal to s2 in 2 nd way");
	}
	       
  // 3rd way of comparison of string
	
	if(s1.equalsIgnoreCase(s2)) {
		System.out.println("s1 is equal to s2 in 3 rd  way");
	}
	else {
		System.out.println("s1 is not equal to s2 in 3 rd  way");
	}
	
	}

}
