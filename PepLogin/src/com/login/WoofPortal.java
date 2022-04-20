package com.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WoofPortal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//C:\Users\cgupta\OneDrive - Prolifics Corporation Ltd.,\Desktop\New\chromedriver_win32 (1)
		System.setProperty("webdriver.chrome.driver","C:\\Users\\cgupta\\OneDrive - Prolifics Corporation Ltd.,\\Desktop\\New\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");

		driver.manage().window().maximize();
	}

}
