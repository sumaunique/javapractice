package JavaCourse;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG5 {

	
@Test
public void a () {
	System.out.println("Hello a method");
}
@Test(invocationCount = 2, priority = -1, enabled = true & false)     // test will not execute
public void b () {
	System.out.println("Hello b method");
}
@Test(invocationCount = 2, priority = -1, enabled = false & true )     // test will not execute
public void c () {
	System.out.println("Hello c method");
}
@Test(invocationCount = 2, priority = -1, enabled = true & true )     // test will  execute
public void d () {
	System.out.println("Hello d method");
}
@Test(invocationCount = 2, priority = -1, enabled = false & false )     // test will not execute
public void e() {
	System.out.println("Hello e method");
}
@Test(invocationCount = 2)
public void f () {
	System.out.println("Hello f method"); 
}
@BeforeMethod
public void g() {
	System.out.println("Hello g test method");
}
}
