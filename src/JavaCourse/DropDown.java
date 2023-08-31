package JavaCourse;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class DropDown {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumal\\OneDrive\\Documents\\Interview Preparation\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0')]")).click();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		
		List<WebElement> birthMonth = driver.findElements(By.xpath("//select[@id='month']/option"));
		//1st way
		Thread.sleep(2000);
		
		System.out.println("Total dropdown values :" + birthMonth.size());
		birthMonth.get(0).click();//jan
		
		//2nd way
		WebElement bm = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select month = new Select(bm);
		
		Thread.sleep(2000);
		
		month.selectByVisibleText("Feb");//Feb
		Thread.sleep(2000);
		
		month.selectByValue("3");//Mar
		Thread.sleep(2000);
		month.selectByIndex(3);//APr
		
		System.out.println(month.getFirstSelectedOption().getText());//April
		
		//3rd way
		Thread.sleep(2000);
		
		List<WebElement> Dropdown = month.getOptions();
		
		for (int i = 0; i<Dropdown.size();i++) {
			if (Dropdown.get(i).getText().equalsIgnoreCase("May")) {
				Dropdown.get(i).click();//May
				
	//4th way
			Thread.sleep(2000);	
			
		bm.sendKeys("Jun");	//June
		
	//5th way
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Jul");//July
		
		
		//if drop down is supports multi selection,this month dropdown is not multi selective
		
		System.out.println(month.isMultiple());
		
		month.selectByVisibleText("Feb");//Feb
		
		month.selectByValue("3");//Mar
	
		month.selectByIndex(3);//APr
		
		System.out.println(month.getFirstSelectedOption().getText());//April
		
		//Deselect the selected optioins
		
        month.deselectByVisibleText("Feb");//Feb
		
		month.deselectByValue("3");//Mar
	
		month.deselectByIndex(3);//APr
		
		month.deselectAll();
		
		// in this program we get error for deselect , since month is not multi support 
		
		
		//error is like below
		
		//Exception in thread "main" java.lang.UnsupportedOperationException: You may only deselect options of a multi-select
		//at org.openqa.selenium.support.ui.Select.deselectByVisibleText(Select.java:264)
		//at JavaCourse.DropDown.main(DropDown.java:92)

		
			}
		}
		
		
		
		
		
	}

}
