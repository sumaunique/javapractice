package JavaCourse;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xslf.usermodel.XSLFSlideShowFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingExcelFile {

	public static void main(String[] args) throws Exception {
		
	//Specifying location of excel file
		File src =new File("C:\\Users\\sumal\\data to readvexcel file in selenium.xlsx");
		
	//Load file
	FileInputStream fis = new FileInputStream(src);
	
	//Load Workbook
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	//Load sheet
	XSSFSheet sh = wb.getSheet("sheet1");
	
	System.out.println(sh.getSheetName());
	
	//print s.no from sheet
	System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
	System.out.println(sh.getRow(0).getCell(1).getStringCellValue());
	
	//print float or double from sheet
	System.out.println(sh.getRow(1).getCell(0).getNumericCellValue());
	System.out.println((int)sh.getRow(1).getCell(0).getNumericCellValue());
	
	//print total no of rows in sheet - 1 st way
	System.out.println("Total no of rows : " + sh.getPhysicalNumberOfRows());
	
	//print total no of rows in sheet - 2nd way
	System.out.println("Total no of rows : " + (sh.getLastRowNum()+1));
	System.out.println("Total no of rows : " + sh.getLastRowNum());
	
	//print total no.of columns in sheet - 1 st way
	System.out.println("Total no of columns : " + sh.getRow(0).getPhysicalNumberOfCells());
	System.out.println("Total no of columns : " + sh.getRow(1).getPhysicalNumberOfCells());
	
	//print total no.of columns in sheet - 2 nd  way
		System.out.println("Total no of columns : " + sh.getRow(0).getLastCellNum());
		
	// Real Time Implementation
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sumal\\Onedrive\\Documents\\Interview Preparation\\Chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("https://www.facebook.com/");
    
    //Enter user name using excel file
    String abc = sh.getRow(0).getCell(0).getStringCellValue();
    driver.findElement(By.id("email")).sendKeys(abc); 
	}

}
