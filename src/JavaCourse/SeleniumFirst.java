package JavaCourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirst {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumal\\OneDrive\\Documents\\Interview Preparation\\chromedriver_win32\\chromedriver.exe");
		
		
		//Launching chrome browser instance
		
		WebDriver driver = new ChromeDriver();
		
		//open url using get method
		
		driver.get("https://facebook.com");
		
		//maximize the window
		
		driver.manage().window().maximize();
		
		//Delete all cookies
		
      driver.manage().deleteAllCookies();
      
      //open url using navigate method
      driver.navigate().to("https://www.google.com/");
      
      //refresh the page
      
      driver.navigate().back();
      
      //to navigate forward
      driver.navigate().forward();
      
      //To fetch current url
      System.out.println(driver.getCurrentUrl());
      
      //get title of the page
      
      driver.navigate().back();
      System.out.println(driver.getTitle());
      
      //close the browser
      driver.close();
	
	}

}
