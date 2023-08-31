package JavaCourse;

 class Parent {
    public int add(int m, int n){
        return m-n;
    }
      
}


 class Child extends Parent{
    public int add(int m,int n){
        return m+n;
    }
    public int sub(int m,int n){
        return m;
    }

}


public class SimpleInheritanceTest {
    public static void main(String[] a){
      // Child c1 = new Child();
//        Parent p2=new Parent();
        Parent p1 = new Child();
      // Child c2 = (Child) new Parent();
        
        
//        System.out.println(c1.add(10, 11));
//        System.out.println(p2.add(10, 11));
//        System.out.println(p1.add(10, 11));
        System.out.println(((Child) p1).sub(10, 11));
        
    }
}
