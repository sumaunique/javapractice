package JavaCourse;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class TakeScreenshotofFailure2 {

	TakeScreenshotofFailure1 t1 = new TakeScreenshotofFailure1();
	
	@Test
	
	public void doLogin() throws Exception {
		
		WebDriver driver;
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumal\\OneDrive\\Documents\\Interview Preparation\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		
        driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

		driver.get("https://www.google.com/");
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		t1.driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		t1.driver.findElement(By.id("pass")).sendKeys("abcpassword");
		
		//pasds wrong id so that test case will fail
		
		t1.driver.findElement(By.id("email_wrong")).sendKeys("abc@gmail.com");
	
	}

	
	@AfterMethod
	
	public void takeScreenshot (ITestResult result2) throws Exception {
		
		t1.CaptureScreenshot(result2);
		
	}
}
