package JavaCourse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maniselenium {

public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumal\\OneDrive\\Documents\\Interview Preparation\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://gmail.com");
driver.manage().window().maximize();
//implicit wait
driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
driver.findElement(By.xpath("//span[text()='Create account']")).click();
driver.findElement(By.xpath("//span[text()='For my child']")).click();
driver.findElement(By.xpath("//span[text()='Yes, continue']")).click();
driver.findElement(By.id("firstName")).sendKeys("devansh");
driver.findElement(By.id("lastName")).sendKeys("mallelli");
driver.findElement(By.xpath("//span[text()='Next']")).click();
driver.findElement(By.xpath("//input[@aria-label='Day']")).sendKeys("15");
driver.findElement(By.xpath("//*[@class='UDCCJb']/option[11]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id='year']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id='year']")).sendKeys("2012");
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id='gender']/option[3]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[text()='Next']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@class='zJKIV y5MMGc sD2Hod N2RpBe']/div[1]")).click();
//driver.close();


	}

}
