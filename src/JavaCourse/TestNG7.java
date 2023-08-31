package JavaCourse;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG7 {

	
	WebDriver driver;
	
	@BeforeClass
	public void SetEnv() {
		
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumal\\OneDrive\\Documents\\Interview Preparation\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		
        driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

		driver.get("https://www.google.com/");
		
		driver.get("https://www.facebook.com/");
		
		
	}
	@DataProvider
	public Object [] [] dataset() throws Exception{
		
		//specify the location of properties file
		
		File src3 = new File("C:\\Users\\sumal\\eclipse-workspace\\JavaCourse\\src\\JavaCourse\\Repository\\testdata.propertis");

		//create fileInputStream class object to load the file
		
		FileInputStream fis3 = new FileInputStream(src3);
				
		//create properties class object to read the file
				
		Properties pro3 = new Properties();
		pro3.load(fis3);
		
		Object[][] arr = new Object [3] [2];
		
		arr[0][0] = pro3.getProperty("TestData1");
		arr[0][1] = pro3.getProperty("TestData2");
		
		arr[0][1] = "TestData2";
		arr[1][1] = "TestData2";
		
		arr[0][0] = "TestData3";
		arr[0][1] = "TestData3";
		
		
    return arr;
}
	
	@Test(dataProvider = "dataset")
	public void enterData (String username, String password) throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("username");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("password");
		Thread.sleep(2000);;
	}
}
	
