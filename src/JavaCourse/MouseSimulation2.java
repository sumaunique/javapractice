package JavaCourse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation2 {

	public static void main(String[] args) throws Exception {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sumal\\Onedrive\\Documents\\Interview Preparation\\Chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get("https://jqueryui.com/droppable/");
	
	//Switch to frame
	driver.switchTo().frame(0);
	System.out.println("Switched");
	
	//Draggable web element
	
	WebElement drag = driver.findElement(By.id("draggable"));
	
	//Droppable web element
	
	WebElement drop = driver.findElement(By.id("droppable"));
	
	//drag and drop web element using actions class
	Thread.sleep(2000);
	
	Actions act = new Actions(driver);
	act.dragAndDrop(drag, drop).build().perform();
	
	
	}

}
