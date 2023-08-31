package JavaCourse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Alert1 {

	public static void main(String[] args) throws Exception {
		
System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\Sumal\\Onedrive\\Documents\\Interview Preparation\\Chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//Alert handling
driver.get("https://demoqa.com/alerts");
driver.findElement(By.id("alertButton")).click();
//verify alert text
String alertText = driver.switchTo().alert().getText();
String expAlertText = "You clicked a button";
Assert.assertEquals(alertText, expAlertText);

System.out.println("Alert text verified");

//Accept the alert
Thread.sleep(2000);
driver.switchTo().alert().accept();
Thread.sleep(2000);
System.out.println("Alert accepted");
Thread.sleep(2000);

//Dismiss the Alert
Thread.sleep(2000);
driver.findElement(By.id("confirmButton")).click();
Thread.sleep(2000);

String alertText1 = driver.switchTo().alert().getText();
String expalertText1 = "Do you confirm action?";
Assert.assertEquals(alertText1, expalertText1);
Thread.sleep(2000);
driver.switchTo().alert().accept();
System.out.println("Alert accepted");

driver.findElement(By.id("confirmButton")).click();
Thread.sleep(2000);
driver.switchTo().alert().dismiss();
Thread.sleep(1000);
System.out.println("Alert canceled");





	}

}
