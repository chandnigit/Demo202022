package Landingpa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginElements {
	
	public WebDriver driver;
	
	public loginElements(WebDriver driver)
	{
		this.driver=driver;
		
	}
	By user=By.xpath("//input[@id='EmployeeEmailOfficial']");
	 public  WebElement userFild()
	 {
		 return driver.findElement(user);
	 }

	 By pass=By.id("EmployeeHashCode");
	 public  WebElement passField()
	 {
		 return driver.findElement(pass);
	 }
	 By click=By.id("submitBtn");
	 public  WebElement button()
	 {
		 return driver.findElement(click);
	 }
	 
	/* By emo=By.xpath("//img[@title='Happy']");
		public  WebElement emoClick()
		{
			return driver.findElement(emo);
		}*/

	 By text=By.xpath("//span[text()=' Hey! Chandni ']");
	 public WebElement veri()
	 {
		 return driver.findElement(text);
	 }
	
}
