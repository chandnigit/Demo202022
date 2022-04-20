package com.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ObjctRepo {
WebDriver driver;
	public ObjctRepo(WebDriver driver)
	{
		this.driver=driver;
		
	}
	By username=By.xpath("//input[@id='EmployeeEmailOfficial']");
			
			By password=By.xpath("//input[@id='EmployeeHashCode']");
					By button=By.xpath("//button[@id='submitBtn']");
					
					public WebElement U()
					{
						return driver.findElement(username);
					}
					public WebElement p()
					{
						return driver.findElement(password);
					}
					public WebElement buttonclick()
					{
						return driver.findElement(button);
					}
					
}
