package JavaCourse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sumal\\OneDrive\\Documents\\Interview Preparation\\Chromedriver_win32\\Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://google.com/");
		driver.get("https://facebook.com//");
		
		//javaScriptExecutor
		
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;//manual casting
		
		//Locate web element using java script
		
		jse.executeScript("document.getElementById('email').value='abc@gmail.com'" );
		jse.executeScript("document.getElementById('pass').value='abc123'" );
		
		
		//Scroll down using java script
		
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0, 400)");
		
		//Scroll up using java script
		
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0, -400)");
		

	}

}
