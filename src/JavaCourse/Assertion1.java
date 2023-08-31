package JavaCourse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion1 {
	
@Test
	
public void testcase1() {
	String expectedText = "Facebook helps you connect and share with the people in your life.";
	
	
	WebDriver driver;
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumal\\OneDrive\\Documents\\Interview Preparation\\chromedriver_win32\\chromedriver.exe");

	driver = new ChromeDriver();
	
    driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	

	driver.get("https://www.google.com/");
	
	driver.get("https://www.facebook.com/");
	
	String actualText = driver.findElement(By.xpath("//h2[contains(text(),'life.')]")).getText();
	
	//Equal assertion
	
	Assert.assertEquals(actualText, expectedText);
	System.out.println("Equal assertion passed");
	
	//False assertion
	Assert.assertFalse(driver.findElement(By.xpath("//h2[contains(text(),'life.')]")).isSelected());
	
	System.out.println("False assertion verified");
	
	
	//True assertion
	
	Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'life.')]")).isDisplayed());
	
	System.out.println("True assertion verified");
	
	
}

}
