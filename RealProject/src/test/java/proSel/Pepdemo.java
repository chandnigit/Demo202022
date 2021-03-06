package proSel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Landingpa.loginElements;

public class Pepdemo extends DriverClass {
	
	private WebDriver driver;
	private loginElements ll;
	@BeforeClass
	public void initlized() throws IOException
	{

		driver=intializeDriver();
		driver.get(p.getProperty("url"));
		 ll=new loginElements(driver);
	}
	
	@Test(dataProvider="getData", priority = 1)
	public void callBase(String user,String pass) throws IOException, InterruptedException
	{
		
		ll.userFild().sendKeys(user);
		ll.passField().sendKeys(pass);
		ll.button().click();
		//ll.emoClick();
	}
		@DataProvider
		public Object[][] getData()
		{
			
				Object[][] data=new Object[1][2];
				data[0][0]="Chandni.Gupta@prolifics.com";
				data[0][1]="Mohit@1990";
				return data;
		
		
	}
		@AfterClass
		public void tearDown()
		{
			driver.close();
		}
	

}
