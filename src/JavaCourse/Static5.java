package JavaCourse;

public class Static5 {
  static int z = 5;
  int y = 1;
  
  //static method
  public static void a () {
	  z = 10;
	  System.out.println(z);//10
  }
  
  //non static method
  public void b() {
	  z = 15;
	  System.out.println(z);//15
	 a();
  }
	public static void main(String[] args) {
		a();//10
		Static5 s5 = new Static5();
		s5.b();
		
	}

}
