package JavaCourse;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumal\\OneDrive\\Documents\\Interview Preparation\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().deleteAllCookies();
        //driver.get("https://www.facebook.com/");
        //driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //driver.navigate().back();
        
        //implicit wait
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("How stuff works");
        
        //Handling Auto suggestions
        List<WebElement> AllSuggestions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
        
        for(int i = 0; i<AllSuggestions.size();i++) {
        String expResult="How stuff works quiz";
        if(AllSuggestions.get(i).getText().equalsIgnoreCase(expResult)) {
        	AllSuggestions.get(i).click();
        	break;
        }
         
        }
	}
	
}


