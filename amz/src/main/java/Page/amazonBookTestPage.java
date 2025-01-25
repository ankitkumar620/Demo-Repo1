package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import module.loginPage;

public class amazonBookTestPage extends loginPage {
	By searchBox =By.xpath("//input[@id='twotabsearchtextbox']");
	 @FindBy(xpath="//input[@type='submit' and @value='Go']")

	    WebElement btnSubmit;
	
	public void amazonBookFind() throws InterruptedException
	{
		driver=this.driver;
		PageFactory.initElements(driver, this);
		WebDriverWait wait=new WebDriverWait(driver,10);
		Thread.sleep(4000);
		driver.findElement(searchBox).click();
		driver.findElement(searchBox).sendKeys("Book");
		btnSubmit.click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[@class='a-button-text a-declarative']")));
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Price: Low to High']")).click();
		Thread.sleep(4000);
		String name= driver.findElement(By.xpath("(//a[@class='a-link-normal a-text-normal']/span[1])[1]")).getText().toString();
		System.out.println("lowest price item is: "+name);
	}

}
