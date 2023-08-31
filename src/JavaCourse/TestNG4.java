package JavaCourse;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG4 {
	
//@Test
public void a () {
	System.out.println("Hello a test method");
}

/*Skipping test from execution
 * 1 st way- //@Test-Not correct way
 * 2 nd way -widely used in market-@Test(enabled=false)*/
 
 @Test(enabled=false)
 public void b () {
	 System.out.println("Hello Test b method");
 }

@Test(enabled=true)
public void c () {
	System.out.println("Hello c test method");
}

@Test(invocationCount = 2  )         // this test runs 2 times
public void d() {
	System.out.println("Hello d test method");
}

@Test(invocationCount = 0)            //This test will not run , since invocation count is 0
public void e () {
	System.out.println("Hello e test method");
}

//for getting skip count-correct way but not recommended
@Test
public void f () {
	System.out.println("Hello f test method");
	
	throw new SkipException("skipping f test method");
}
}
