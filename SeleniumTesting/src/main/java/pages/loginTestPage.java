package pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import component.browserLaunch;

public class loginTestPage extends browserLaunch 
{
	Properties objfl = new Properties();
	String currentDir = System.getProperty("user.dir");
	private void btn()
	{
		
	}
	
	
	public void loginflow() throws IOException 
	{
		
		FileInputStream objfile = new FileInputStream(currentDir+"\\resources\\commonXpaths.properties");
		objfl.load(objfile);
		//driver= new ChromeDriver();
		driver.findElement(By.xpath(objfl.getProperty("btnlogin"))).click();
		
		driver.close();
	}
}
