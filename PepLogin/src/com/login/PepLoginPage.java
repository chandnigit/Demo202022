package com.login;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PepLoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\cgupta\\OneDrive - Prolifics Corporation Ltd.,\\Desktop\\New\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mckesson.com");
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		PropertyUtils.readDataFile();

	/*public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\cgupta\\OneDrive - Prolifics Corporation Ltd.,\\Desktop\\New\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://pep.prolifics.com/dashboard/info");
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		PropertyUtils.readDataFile();
		
		
		driver.findElement(By.xpath("//input[@id='EmployeeEmailOfficial']")).sendKeys("Chandni.Gupta@prolifics.com");
		driver.findElement(By.xpath("//input[@id='EmployeeHashCode']")).sendKeys("CGCpro0987!");
		driver.findElement(By.xpath("//button[@id='submitBtn']")).click();
		ObjctRepo r=new ObjctRepo(driver);
		r.U().sendKeys(PropertyUtils.getDataProperty("pep.userName"));
		r.p().sendKeys(PropertyUtils.getDataProperty("pep.password"));
		r.buttonclick().click();*/


	}

}
