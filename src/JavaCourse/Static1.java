package JavaCourse;

public class Static1 {
	
  int x = 500;//global variable
  String s = "Hello";//global variable
  static int y = 100;//static variable
  
  //static method
  
 public static void method1() {
	 String x = "Hi";//local variable
	 System.out.println(x);
 
 }
 //Nonstatic method
 
 public void method2() {
	 int i = 100;//local variable
	 System.out.println(i);
 }
}
