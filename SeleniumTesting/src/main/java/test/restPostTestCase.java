package test;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class restPostTestCase 
{

	
	@Test
	public void PostTestCase()
	{
		
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		RequestSpecification httprequest=RestAssured.given();
		JSONObject requestParams=new JSONObject();
		requestParams.put("name","Ankit");
		  requestParams.put("salary","1000");
		  requestParams.put("age","30");
		  requestParams.put("id","8");
		  httprequest.header("Content-Type","application/json");
		  httprequest.body(requestParams.toJSONString());
		  Response response=httprequest.request(Method.POST,"/create");
		//print response in console window
		  
		  String responseBody=response.getBody().asString();
		  System.out.println("Response Body is:" +responseBody);
		  //status code validation
		  int statusCode=response.getStatusCode();
		  System.out.println("Status code is: "+statusCode);
		 // Assert.assertEquals(statusCode, 201);
		  
		//success code validation
		  String successCode=response.jsonPath().get("SuccessCode");
		  System.out.println("Status code is: "+successCode);
		  
	}
}
