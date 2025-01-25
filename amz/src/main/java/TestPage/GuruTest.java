package TestPage;

import org.testng.annotations.Test;

import Page.GuruTestPage;
import module.loginPage;

public class GuruTest extends loginPage{
	loginPage login= new loginPage();
	GuruTestPage val= new GuruTestPage();
	
	@Test	
	public void test1() throws InterruptedException 
	{
		
		//login.loginFunction();
		val.testValidation();
	}

}
