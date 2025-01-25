package Org.Testing.TestTrigger;

import java.io.IOException;

import org.testng.annotations.Test;

import Org.Testing.TestCases.TC1_Get;
import Org.Testing.TestCases.TC2_Post;
import Org.Testing.TestCases.TC3_Delete;
import Org.Testing.TestCases.TC4;

public class Trigger {
	
		@Test(priority=1)
		public void second() throws IOException
		{
		System.out.println("Called Test Case 2- post() Request");
		TC2_Post TC2Obj=new TC2_Post();
		TC2Obj.TC2_PostMethod();
		System.out.println("--------------End of Test Case 2 the post() Request-------------");
		System.out.println("\n");
		}
		
		
		@Test(priority=2)
		public void first() throws IOException
		{
		System.out.println("Called Test Case 1- get() Request");
		TC1_Get TC1Obj=new TC1_Get();
		TC1Obj.TC1_GetMethod();
		System.out.println("--------------End of Test Case 1 the get() Request--------------");
		System.out.println("\n");
		}
		
		@Test(priority=3)
		public void fourth() throws IOException
		{
		System.out.println("Called Test Case 4- put() Request");
		TC4 TC4Obj=new TC4();
		TC4Obj.testcase4();
		System.out.println("--------------End of Test Case 4 the put() Request--------------");
		System.out.println("\n");
		}
		
		@Test(priority=4)
		public void third() throws IOException
		{
		System.out.println("Called Test Case 3- delete() Request");
		TC3_Delete TC3Obj=new TC3_Delete();
		TC3Obj.TC3_DeleteMethod();
		System.out.println("-------------End of Test Case 3 the delete() Request------------");
		}
		
		
	
}
