package proSel;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Landingpa.loginElements;

public class callDriverClass extends DriverClass {
	
	private WebDriver driver;
	
	@BeforeClass
	public void initlize() throws IOException
	{

		driver=getDriver();
		driver.get(p.getProperty("url"));
	}
	
	//@Test(dataProvider="getData")
	
	public void callBase(String user,String pass) throws IOException, InterruptedException
	{
		loginElements ll=new loginElements(driver);
		ll.userFild().sendKeys(user);
		ll.passField().sendKeys(pass);
		ll.button().click();
		Thread.sleep(3000);
		System.out.println("hii");
		
		
		System.out.println("Hi this is git push again1");
		System.out.println("Hi this is git push again1");
		System.out.println("Hi this is git push again1");
		System.out.println("Hi this is git push again1");
		System.out.println("Hi this is git push again1");
		
		Assert.assertEquals(ll.veri().getText(), "Hey! Chandni");
		System.out.println("hii");
		
		
	}
	@Test
	public void testSelctor() throws InterruptedException {
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_optgroup");
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		
		List<WebElement> dropDownElements=new Select(driver.findElement(By.id("cars"))).getOptions();
		for(WebElement e:dropDownElements)
		{
			System.out.println("Values=="+e.getText());
		}
		
		driver.switchTo().defaultContent();
		
		driver.get("https://www.w3schools.com/bootstrap/tryit.asp?filename=trybs_dropdown-menu&stacked=h");
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@data-toggle='dropdown']")).click();
		List<WebElement> dde=driver.findElements(By.cssSelector(".dropdown-menu>li>a"));
		List<String> colors=new LinkedList<String>();
		for(WebElement e:dde)
		{
			System.out.println("LI Values=="+e.getText());
			colors.add(e.getText());
		}
		colors.remove("CSS");
		driver.switchTo().defaultContent();
		
		
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
 