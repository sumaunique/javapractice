package JavaCourse;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion2 {

	
	@Test
public void testcase2() {
		
		
String actualText= "ab";
String expectedText = "ab";


int a = 10;
int b = 20;

//Equal Assertion
Assert.assertEquals(actualText, expectedText,"Actual and expected are not matching");

System.out.println("Equal Assertion pass");


//False assertion

Assert.assertFalse(a>b,"a is greater than b ");
System.out.println("False assertion  verified");


//True assertion
Assert.assertTrue(a<b, "a is lesser than b");
//Assertion failed, execution will stop here
//Further line of the code will not execute

System.out.println("Trur assertiobn verified");

	}
	
@Test
public void testcase3() {
	System.out.println("Hello test case3() method ");
	
	//Assertion written in testcase 2() method
	// hence the scope of assertion will be limited to testcase 2() method only
	
	
}
}
