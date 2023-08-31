package JavaCourse;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class SleniumOpenApplication {

public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumal\\OneDrive\\Documents\\Interview Preparation\\chromedriver_win32\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("https://www.google.com/");

driver.manage().window().maximize();

driver.navigate().to("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=120&lwc=1348028");

driver.navigate().back();

driver.navigate().forward();

System.out.println(driver.getCurrentUrl());
 
System.out.println(driver.getTitle());

driver.close();


	}

}
