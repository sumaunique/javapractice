package JavaCourse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation1 {

	public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sumal\\OneDrive\\Documents\\Interview Preparation\\Chromedriver_win32\\Chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       driver.get("https://google.com");
       driver.get("https://www.flipkart.com/");
       Thread.sleep(2000);
       driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
       Thread.sleep(2000);
       
       //Create Grocery web element REF
       
       WebElement fash= driver.findElement(By.xpath("//*[text()='Fashion']"));
       
       //create mouse simulation using Actions class
       Actions act = new Actions(driver);
       
       //To mouse over on web element
       Thread.sleep(2000);
       act.moveToElement(fash).build().perform();
       
       //To key board operations
       Thread.sleep(2000);
       driver.navigate().refresh();
       WebElement electro = driver.findElement(By.xpath("//*[text()='Electronics']"));
       Thread.sleep(2000);
       act.sendKeys(electro, Keys.ENTER).build().perform();
       System.out.println("Electronics option clicked");
       Thread.sleep(2000);
       act.contextClick().build().perform();
       
       
	}

}
