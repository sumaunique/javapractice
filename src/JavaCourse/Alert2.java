package JavaCourse;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Alert2 {

	public static void main(String[] args) throws Exception {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sumal\\Onedrive\\Documents\\Interview Preparation\\Chromedriver_win32\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

driver.get("https://demoqa.com/alerts");

//Handling alert
driver.findElement(By.id("promtButton")).click();
System.out.println("Prompt button clicked");
Thread.sleep(1000);
Alert al=driver.switchTo().alert();
al.sendKeys("suma");
//Finding alertText
String alertText = al.getText();
String expalertText = "Please enter your name";
Assert.assertEquals(alertText, expalertText);

//driver.switchTo().alert().accept();
Thread.sleep(3000);
driver.switchTo().alert().sendKeys("suma");

driver.switchTo().alert().accept();

Thread.sleep(2000);
System.out.println("Entered Text");
driver.close();


	}

}
