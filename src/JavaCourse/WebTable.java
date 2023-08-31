package JavaCourse;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumal\\OneDrive\\Documents\\Interview preparation\\Chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://google.com");
		driver.get("https://money.rediff.com/gainers");
		
		
		//Create list of all companies
		List<WebElement> allCompanies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		
		System.out.println("Total companies:" + allCompanies.size());
		
		//Create list of all prices
		List<WebElement> currentPrice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		
		System.out.println("Total price:" + currentPrice.size());
		
		String expcompanyName = "shyam Telecom";
		
		for(int i =0;i<allCompanies.size(); i++){
			
			if(allCompanies.get(i).getText().equalsIgnoreCase(expcompanyName)) {
				
				System.out.println(allCompanies.get(i).getText()+ " === " + currentPrice.get(i).getText());
				allCompanies.get(i).click();
				break;
				
				
				 
			}
		}
	}

}
