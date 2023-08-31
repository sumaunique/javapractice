package JavaCourse;

public class RelationalOperators2 {


	public static void main(String[] args) {
		
		String p = "HELLO";
		
		String q = "hello";
		
		System.out.println(p);
		System.out.println(q);
		
	//first way of comparison
	
		if(p==q) 
			
		{
		System.out.println("p is equal to q in first way");
		}
		
		else {
			System.out.println("p is not equal to q in first way");
		}
			
 // second way of comparison
		
		if(p.equals(q)) {
			
			System.out.println("p is equal to q in second way");
			
		}
		else {
			System.out.println("p is not equal to q in second way");
		}
	// string 3 rd way of comparison
		if(p.equalsIgnoreCase(q)) {
			System.out.println(" p is equal to q in thirdway");
		}
		else {
			System.out.println("p is not equal to q in thirdway");
		}
	}
}
