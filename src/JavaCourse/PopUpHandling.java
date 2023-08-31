package JavaCourse;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandling {

	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sumal\\Onedrive\\Documents\\Interview Preparation\\Chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://demoqa.com/browser-windows");
	
	//Tab Handling
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//button[text()='New Tab']")).click();
	driver.findElement(By.id("tabButton")).click();
	
	//Get total no of tabs/windows opened
	Set<String> allWindowsId = driver.getWindowHandles();
	System.out.println(allWindowsId);//will display alphanumeric code
	
	Iterator<String> abc = allWindowsId.iterator();	
	String win1 = abc.next();
	String win2 = abc.next();
	
	
	//print title of parent window
	driver.switchTo().window(win1);
	System.out.println(" parent window ID : "+ win1);
	System.out.println("Title of Parent window:  "+driver.getTitle());
	
	//Print title of child tab
	  driver.switchTo().window(win2);
	  System.out.println("Clild tab ID: " + win2);
	  System.out.println("Title of Child Tab :" +driver.getTitle());//There is no title for child tab ,hence nothing printed
	  System.out.println("Title of child Tab: " + driver.getCurrentUrl());
	  
	  
	  
	  //Step-2  Handling windows /popups
	  
	  Thread.sleep(2000);
	  driver.switchTo().window(win1);
	  Thread.sleep(2000);
	  driver.findElement(By.id("windowButton")).click();
	  
	//Print title of child window
	  Set<String> allWindowsID2 = driver.getWindowHandles();
	  System.out.println(allWindowsID2);
	  Iterator<String> abc1 = allWindowsID2.iterator();
	  String win3 = abc1.next();
	  String win4 = abc1.next();
	  Thread.sleep(2000);
	  driver.switchTo().window(win4);
	  Thread.sleep(2000);
	  System.out.println("Chiild window ID: " + win4);
	  System.out.println("Title of Child Tab :" +driver.getTitle());//There is no title for child tab ,hence nothing printed
	  System.out.println("Title of child Tab: " + driver.getCurrentUrl());
	  
	  //driver.quit();
	  driver.close(); 
	  System.out.println("Windows and popups handled");
	  
	  
	  
	}

}
