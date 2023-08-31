package JavaCourse;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		
	HashMap <Integer, String> hm= new HashMap <Integer, String>();
	
	hm.put(1, "Jan");
	hm.put(2, "Feb");
	hm.put(3, "mar");
	hm.put(4, "Apr");
	hm.put(5, "monday");
	hm.put(6, "Tuesday");
	System.out.println(hm.get(1));
	System.out.println(hm.get(2));
	System.out.println(hm.get(3));
	System.out.println(hm.get(4));
	System.out.println(hm.get(5));
	System.out.println(hm.get(6));
	

	}

}
