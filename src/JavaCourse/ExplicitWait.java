package JavaCourse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:\\users\\sumal\\onedrive\\Documents\\interview preparation\\chromedriver_win32\\chromedriver.exe");

		  WebDriver driver = new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		  driver.get("https://google.com");
		  
		  driver.get("https://facebook.com");
		  //Enter user name
		  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcd@gmail.com");
		  
		  //Fetch attribute input box value
		  
		  System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value"));
		  
		  // Fetch height of input box
		  
		  System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getSize().getHeight());
		  
		  //Fetch width of input box
		  
		  System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getSize().getWidth());
		  
		  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abcd");
		  
		  ///use explicit wait to check password field is visible
		 WebDriverWait wt = new WebDriverWait(driver,30);
		  //wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass"))).sendKeys("abcd");
	}

}
