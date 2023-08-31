package JavaCourse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws Exception {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Sumal\\Onedrive\\Documents\\Interview Preparation\\Chromedriver_win32\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

driver.get("https://paytm.com/");

//To find web element
//driver.findElement(By.xpath("//img[@alt='user']")).click();

driver.findElement(By.xpath("//*[text()='Sign In']")).click();

//To Find number of frames 

int allFrames = driver.findElements(By.tagName("iframe")).size();
System.out.println("Total No.of Frames:" + allFrames);

Thread.sleep(2000);

for(int i = 0;i<allFrames;i++) {
	
	driver.switchTo().frame(i);

Thread.sleep(2000);

driver.findElement(By.xpath("//*[contains(text(),'Watch Video')]")).click();

Thread.sleep(2000);

driver.findElement(By.xpath("//span[contains(text(),'close')]")).click();

}


	}

}
