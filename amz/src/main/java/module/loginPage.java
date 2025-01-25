package module;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class loginPage {
	
	public static WebDriver driver;
	public static Properties prop= new Properties();
	public static String workingdir=System.getProperty("user.dir");
	
	@BeforeSuite
	public void loginFunction()
	{
		try {
		FileInputStream objfile = new FileInputStream(workingdir+"\\src\\main\\resources\\application.properties");
		prop.load(objfile);
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	System.setProperty("webdriver.chrome.driver", workingdir+"\\src\\server\\"+prop.getProperty("server"));
	//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
	//"C:\\Users\\Ank\\Downloads\\chromedriver_win32\\chromedriver.exe"
	
	driver= new ChromeDriver();
	driver.get(prop.getProperty("url"));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
}
