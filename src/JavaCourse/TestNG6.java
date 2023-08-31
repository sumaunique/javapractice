package JavaCourse;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG6 {

@Test
public void z() {
Assert.assertTrue(3>12);    // since the condition is false ,it fails
System.out.println("Hello z test method");
}

@Test(dependsOnMethods = "z")      // since this test method depends on z , which has false condition , this test method also will fail
public void b() {
	System.out.println("Hello b method");
}
}
