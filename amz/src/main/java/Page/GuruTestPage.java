package Page;


import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import module.loginPage;

public class GuruTestPage extends loginPage {
	
	By imgJmeter =By.xpath("//body/a/img");
	By toptur= By.xpath("//h4/a");
	
	public void testValidation() throws InterruptedException
	{
		WebDriverWait wait= new WebDriverWait(driver,20);
		String mainWindow= driver.getWindowHandle();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("a077aa5e");
		wait.until(ExpectedConditions.elementToBeClickable(imgJmeter));
		driver.findElement(imgJmeter).click();
		
		Thread.sleep(3000);
		Set<String>win=driver.getWindowHandles();
		Iterator<String> it= win.iterator();
		while(it.hasNext())
		{
			if(it.next()!=mainWindow)
			{
				driver.switchTo().defaultContent();
				driver.switchTo().window(it.next());
			}
		}
		
		List<WebElement> toptutorial= driver.findElements(toptur);
		
		
		
		for(int i=0;i<toptutorial.size();i++)
		{
			String val=toptutorial.get(i).getText();
			System.out.println(val);
		}
		driver.quit();
	}

}
