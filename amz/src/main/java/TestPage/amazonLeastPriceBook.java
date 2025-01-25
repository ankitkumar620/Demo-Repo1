package TestPage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Page.amazonBookTestPage;
import module.loginPage;

public class amazonLeastPriceBook extends loginPage{

loginPage login= new loginPage();
amazonBookTestPage testpage= new amazonBookTestPage();

@Test	
public void test1() throws InterruptedException 
{
	
	login.loginFunction();
	testpage.amazonBookFind();
	//driver.quit();
	
	
	
	
}


}
