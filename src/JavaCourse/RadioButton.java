package JavaCourse;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButton {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumal\\OneDrive\\Documents\\Interview Preparation\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0')]")).click();
		
		
		//implicit wait
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		//explicit wait
		
		
		WebDriverWait wait = new WebDriverWait(driver,3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//input[@value='1']")));
		
		
		//1st way of selection of radio  button
		
//		driver.findElement(By.xpath("//input[@value='1']")).click();
//		
//		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		
		//2nd way of selecting radio buttons
		
		List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
		
		System.out.println("Total no of Radio buttons : " + radio.size());
		
		System.out.println(radio.get(0).isSelected());//female
		
		System.out.println(radio.get(1).isEnabled());//male
		
		System.out.println(radio.get(2).isDisplayed());//custom
		
		System.out.println(radio.get(2).isSelected());
		
		
		//3rd way
	
	List<WebElement>  radio1 = driver.findElements(By.xpath("//label[@class='_58mt']"));
	
	System.out.println("Total No.of radio Text =" +radio1.size());
	
		String expResult = "Female";
		
	for(int i = 0; i<radio1.size();i++) {
	
	if (radio1.get(i).getText().equalsIgnoreCase(expResult))   {
		
			radio1.get(i).click();
		System.out.println(expResult + "clicked");
		break;
		
			
			
		}
			
		
	}
		
		


		
		


	}

}
