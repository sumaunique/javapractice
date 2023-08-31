package JavaCourse;

import java.util.Hashtable;

public class HashTable1 {

	public static void main(String[] args) {
		
		Hashtable <Integer,String> ht = new Hashtable<Integer,String>();
		
		ht.put(1, "Suma");
		ht.put(2, "mani");  
		ht.put(3, "Deva");
		ht.put(4, "Laahi");
		
		System.out.println(ht.get(1));
		System.out.println(ht.get(2));
		System.out.println(ht.get(3));
		System.out.println(ht.get(4));


	}

	

}
