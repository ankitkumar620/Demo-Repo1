package component;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserLaunch 
{
	public WebDriver driver=new ChromeDriver();;
public void invoke() 
{
	try {
	Properties obj = new Properties();
	//Properties objxp = new Properties();
	String currentDir = System.getProperty("user.dir");
	FileInputStream objfile = new FileInputStream(currentDir+"\\resources\\application.properties");
	//FileInputStream objXpath = new FileInputStream(currentDir+"\\resources\\commonXpaths.properties");
	obj.load(objfile);
	//objxp.load(objXpath);
	
	System.setProperty("webdriver.chrome.driver", currentDir+"\\resources\\"+obj.getProperty("driverName")+".exe");
	System.out.println("Current dir using System:" +currentDir);
	driver.get(obj.getProperty("url1").toString());
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}catch(Exception ex)
	{
	ex.printStackTrace();
	}
	
	
}

}
