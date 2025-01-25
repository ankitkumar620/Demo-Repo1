package test;

import java.io.IOException;

import org.testng.annotations.Test;
import component.browserLaunch;
import pages.loginTestPage;

public class loginPage 
{
	browserLaunch launch= new browserLaunch();
	loginTestPage logintest= new loginTestPage();
@Test
public void login() throws IOException 
{
	launch.invoke();
	logintest.loginflow();
	
}

}
