package JavaCourse;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.examples.util.TempFileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TakeScreenshotofFailure1 {
	
	WebDriver driver;
	
	
//ITestResult will provide us the test case execution status and test name
	
	public void CaptureScreenshot(ITestResult result) throws Exception  {
		
		if (ITestResult.FAILURE==result.getStatus()){
			
//Create ref of take screenshot  interface type casting
			
TakesScreenshot ts = (TakesScreenshot) driver;


//use get screenshot()method to capture screenshot in file format

//get screenshotsAS() method return type


File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		
//copy the file to specific location

File destFolder = new File("./screenshots/" + result.getName() + ".png");

FileUtils.copyFile(sourceFile, destFolder);

System.out.println(result.getName() + "method()screenshotcaptured.");


}

}
}