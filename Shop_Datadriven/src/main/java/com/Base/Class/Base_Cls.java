package com.Base.Class;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Cls {
	
    public static WebDriver driver;
    
    // Browser
    
    public static WebDriver get_Browser(String type) {
    	
    	if (type.equalsIgnoreCase("chrome")) {
			
    		System.setProperty("webdriver.chrome.driver", 
    				"C:\\Users\\sathi\\eclipse-workspace\\Shop_Datadriven\\Driver\\chromedriver.exe");
    		
    		driver = new ChromeDriver();
    		
    		driver.manage().window().maximize();
    		
		} else if(type.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", 
    				"C:\\Users\\sathi\\eclipse-workspace\\Blac_Frid\\Driver\\chromedriver.exe");
    		
    		driver = new FirefoxDriver();
    		
    		driver.manage().window().maximize();

		}
		return driver;

	}
    
    //Url
    
    public static void get_Url(String url) {
    	
    	driver.get(url);

	}
    
    //get Title
    
    public static String get_Title() {
    	
    	String title = driver.getTitle();
    	
    	return title;

	}
    
    //Close
    
    public static void close() {
    	
    	driver.close();

	}
    
    //Quit
    
    public static void quit() {
    	
    	driver.quit();

	}
    
    //get CurrentUrl
    
    public static String get_CurrentUrl() {
    	
    	String currentUrl = driver.getCurrentUrl();
    	
    	return currentUrl;

	}
    
    //Get Pagesource
    
    public static String get_PageSource() {
    	
    	String pageSource = driver.getPageSource();
    	
    	return pageSource;

	}
    
    //get To
    
    public static void get_To(String url) {
    	
    	driver.navigate().to(url);

	}
    
    //get Back
    
    public static void get_Back() {
    	
    	driver.navigate().back();

	}
    
    //get Forward
    
    public static void get_Forward() {
    	
    	driver.navigate().forward();

	}
    
    //get Refresh
    
    public static void get_Refresh() {
    	
    	driver.navigate().refresh();

	}
    
    //Click Button
    
    public static void click_Button(WebElement element) {
    	
    	element.click();

	}
    
    //Sendkeys
    
    public static void send_Keys(WebElement element,String value) {
    	
    	element.sendKeys(value);

	}
    
    //get Text
    
    public static String get_Text(WebElement element) {
    	
    	String text = element.getText();
    	   	
    	return text;

	}
    
    //to Clear
    
    public static  void to_Clear(WebElement element) {
    	
    	element.clear();

	}
    
    //is Displayed
    
    public static boolean is_Displayed(WebElement element) {
    	
    	boolean displayed = element.isDisplayed();
    	
    	return displayed;

	}
    
    //is Selected
    
    public static boolean is_Selected(WebElement element) {
    	
    	boolean selected = element.isSelected();
    	
    	return selected;

	}
    
    //isEnabled
    
    public static boolean is_Enabled(WebElement element) {
	
	boolean enabled = element.isEnabled();
	
	return enabled;

    }
    
    //Select
    
    public static void drop_Down(WebElement element,String value,String type) {
    	
    	Select s = new Select(element);
    	
        if (type.equalsIgnoreCase("ByVisibleText")) {
			
        	s.selectByVisibleText(value);
		}
        
        else if (type.equalsIgnoreCase("ByValue")) {
        	
        	s.selectByValue(value);
			
		}
        
        else if (type.equalsIgnoreCase("ByIndex")) {
        	
        	int byIndex_Value = Integer.parseInt(value);
        	s.selectByIndex(byIndex_Value);
			
		}
        
        else if (type.equalsIgnoreCase("DeselectByvalue")) {
        	
        	s.deselectByValue(value);
			
		}
        
        else if(type.equalsIgnoreCase("DeselectedByVisibleText")) {
        	
        	s.deselectByVisibleText(value);
        }
          
	}
    
    //Thread sleep
    
    public static void sleep(int value) throws InterruptedException {
    	
    	Thread.sleep(value);

	}
    
    //Implicit Wait
    
    public static void implicit_Wait(int value) {
    	
    	driver.manage().timeouts().implicitlyWait(value, TimeUnit.SECONDS);

	}
    
    //Explicit Wait
    
    public static void explicit_Wait(WebElement element, int value) {
    	
    	WebDriverWait wait = new WebDriverWait(driver,value);
    	wait.until(ExpectedConditions.visibilityOf(element));

	}
    
    //Particular Value
    
    public static String value;
    
    public static String get_Particular_Data(int sheet, int row, int cell) throws IOException {
    	
    	File f = new File("C:\\Users\\sathi\\eclipse-workspace\\Shop_Datadriven\\Excel\\Data.xlsx");
    	
    	FileInputStream fis = new FileInputStream(f);
    	System.out.println(fis);
    	Workbook wb = new XSSFWorkbook();
    	System.out.println(wb);
    	Sheet sh = wb.getSheet("0");
    	System.out.println(sh);
    	
    	Row r = sh.getRow(row);
    	
    	Cell c = r.getCell(cell);
    	
    	CellType ct = c.getCellType();
    	
    	if (ct.equals(CellType.STRING)) {
    		
    		value = c.getStringCellValue();
			
		}
    	
    	else if (ct.equals(CellType.NUMERIC)) {
    		
    		double d = c.getNumericCellValue();
    		
    		int a = (int)d;
    		
    		value = String.valueOf(a);
			
		}
    	
    	wb.close();
    	
    	return value;

	}
    
	
}
