package getRequest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.json.JSONObject;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetData {

	@Test
	public void testResponseCode()
	{
		//Response resp=RestAssured.get("http://google.com");
		Response resp= RestAssured.get("http://localhost:3000/posts");
		int code= resp.getStatusCode();
		String res=resp.contentType();
		String ress=resp.asString();
		//JSONObject jo=new JSONObject(ress);
		//String resss=jo.getJSONArray("data").getJSONObject(1).get("id").toString();
		System.out.println("Status is: "+code);
		System.out.println("Cotent Type is: "+res);
		System.out.println("Content is: "+ress);
	}
	
	@Test
	public void getData() throws FileNotFoundException
	{
		File f= new File("../restTest/Body.json");
		FileInputStream fs= new FileInputStream(f);
	/*	JSONTokener jt= new JSONTokener(fs);
		JSONObject jp= new JSONObject(jt);*/
		
		
	}
}
