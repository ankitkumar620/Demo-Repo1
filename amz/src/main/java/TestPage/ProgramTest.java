package TestPage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProgramTest {

	 /*int a=0;
	 int b=a+2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProgramTest t= new ProgramTest();
		
		String s1= "abc";
		String s2=null;
		
		String s3=s1+s2;
		
		System.out.println(t.a);
		//System.out.println(b);

	}*/
	/*@BeforeClass
	public void beforec1()
	{
		System.out.println("bclass1");
	}
	@AfterClass
	public void afbeforec1()
	{
		System.out.println("aclass1");
	}
	@BeforeMethod
	public void beforem1()
	{
		System.out.println("bmethod1");
	}*/
	
	@Test(priority=0)
	public void test1()
	{
		System.out.println("test1");
	}
	
	@Test(priority=-1)
	public void test2()
	{
		
		String st[]= {"hello","my","name"};
		String capitalizeWord="";  
		 for(String w:st)
		{
			String first=w.substring(0,1); 
			String afterfirst=w.substring(1);
			capitalizeWord+=first.toUpperCase()+afterfirst+" ";  
			
		} System.out.println(capitalizeWord);
	}
	/*@AfterMethod
	public void afterm1()
	{
		System.out.println("amethod1");
	}*/

}
