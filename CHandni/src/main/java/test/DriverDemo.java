package test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverDemo {
	

	public static void main(String args[])
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\cgupta\\OneDrive - Prolifics Corporation Ltd.,\\Desktop\\New\\chromedriver_win32 (1)\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	driver.findElement(By.id("newWindowsBtn")).click();
	String parent=driver.getWindowHandle();
	Set<String> handle=driver.getWindowHandles();
	
	//for(String win:handle)
	//Iterator<String> it=handle.iterator();
	String win="";
	//for(int i=0;i<handle.l)
		
	//if(!win.equals(parent))
			//{
	
	driver.switchTo().window(win);
	//driver.findElement(By.xpath("//span[text()='EXPERTISE']")).click();
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	//driver.findElement(By.xpath("//span[text()='Buy me a coffee']")).click();
	driver.close();
	
			
	
}
}