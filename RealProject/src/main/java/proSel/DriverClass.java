package proSel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverClass {

	private static WebDriver driver;
	public static  Properties p;
	
	@BeforeSuite
	public static WebDriver intializeDriver() throws IOException 
	{    
		FileInputStream fis=new FileInputStream("D:\\personal\\RealProject\\src\\main\\java\\proSel\\driverAll.properties");
		p=new Properties();
		p.load(fis);
		
		String browserName=p.getProperty("browser");
		System.out.println("hgjg");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\cgupta\\OneDrive - Prolifics Corporation Ltd.,\\Desktop\\New\\chromedriver_win32 (1)\\chromedriver.exe");
			
			
			ChromeOptions o=new ChromeOptions();
			o.setAcceptInsecureCerts(true);
			o.setHeadless(false);
			
			
			driver=new ChromeDriver(o);
			 
			

		}
		else if(browserName=="IE")
		{
			//
		}
		else if(browserName=="Firefox")
		{
			//
		}
		return driver;
		

	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	

}
