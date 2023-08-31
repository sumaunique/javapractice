package JavaCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseSimulation3 {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sumal\\Onedrive\\Documents\\Interview Preparation\\Chromedriver_win32\\chromeDriver.exe");

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://jqueryui.com/droppable/");

//To switch frame
driver.switchTo().frame(0);
System.out.println("Swwitched");

//To drag Web element
WebElement drag = driver.findElement(By.id("draggable"));

//To drag and drop web element
Actions act = new Actions(driver);
act.dragAndDropBy(drag, 100, 60).build().perform();

// To drag and hold
act.clickAndHold(drag).dragAndDropBy(drag, 100, 60).build().perform();


	}

}
