package JavaCourse;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jLogging {

	public static void main(String[] args) {
		
		
		// create logger instance
		
		Logger logger =Logger.getLogger("Log4jLogging");
		
		//configure log4j properties
		PropertyConfigurator.configure("C:\\Users\\sumal\\eclipse-workspace\\JavaCourse\\src\\log4j.properties");
		
		//open browser instance
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\Sumal\\Onedrive\\Documents\\Interview Preparation\\Chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		logger.info("chrome browser instance opened");
		
		//maximize the window
		driver.manage().window().maximize();
		logger.info("window maximized");
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logger.info("Implicit wait given");
		
		
		//open URL
		try {
			driver.get("https://www.facebook.com/");
		
		logger.info("Application opened");
		
		//Check if web element is displayed or not
		driver.findElement(By.id("emails")).isDisplayed();
		logger.info("Element is not dispalyed");
		
		}   catch (Exception e) {
			logger.info("failure- emails element is not dispalyed");
		}
		

	}

}
