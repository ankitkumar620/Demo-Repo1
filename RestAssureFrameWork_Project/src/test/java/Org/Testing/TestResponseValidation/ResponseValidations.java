package Org.Testing.TestResponseValidation;

import org.testng.Assert;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class ResponseValidations
	{
	
	public void ResponseValidation(ResponseBody Res)
		{
		//System.out.println(Res.getStatusLine());
		System.out.println(Res.asString());
		}
	
	
	public static void ResponseStatusCodeVal(int ExpStatCode, Response Res)
	{
	Assert.assertEquals(Res.getStatusCode(), ExpStatCode);
	System.out.println("Response Status Validated");
	}
	
	public static void ResponseDataValid(String ExpData, String ActualData)
	{
	Assert.assertEquals(ExpData, ActualData );
	System.out.println("Response Data Validated");
	}
	
}
