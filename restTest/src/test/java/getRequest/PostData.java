package getRequest;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.regex.Pattern;

import org.json.JSONTokener;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostData {
	
	@Test
	public void postData1()
	{
		//Response resp=RestAssured.get("http://google.com");
		RequestSpecification request=RestAssured.given();
		request.header("Content-type","application/json");
		JSONObject json= new JSONObject();
		json.put("id","4");
		json.put("title","json-server4");
		json.put("author","typicode4");
		request.body(json.toString());
		Response resp=request.post("http://localhost:3000/posts");
		int code= resp.getStatusCode();
		System.out.println("Status is: "+code);
		
		
		/*Response resp= RestAssured.post("http://localhost:3000/posts");
		int code= resp.getStatusCode();
		String res=resp.contentType();
		String ress=resp.asString();
		System.out.println("Status is: "+code);
		System.out.println("Cotent Type is: "+res);
		System.out.println("Cotent is: "+ress);*/
	}
	
	@Test
	public void postData2() throws FileNotFoundException
	{
		//Response resp=RestAssured.get("http://google.com");
		File file= new File("C:\\Old_Drive\\File1.json");
		FileReader fr= new FileReader(file);
		JSONTokener jt= new JSONTokener(fr);
		JSONObject jo=new JSONObject(jt);
		
		RequestSpecification request=RestAssured.given();
		request.header("Content-type","application/json");
		request.body(jo.toString());
		Response resp=request.post("http://localhost:3000/posts");
		int code= resp.getStatusCode();
		System.out.println("Status is: "+code);
		
	}
	
	@Test
	public void postData3() throws FileNotFoundException
	{
		//Response resp=RestAssured.get("http://google.com");
		File file= new File("C:\\Old_Drive\\file2.json");
		FileReader fr= new FileReader(file);
		JSONTokener jt= new JSONTokener(fr);
		JSONObject jo=new JSONObject(jt);
		
		String st=jo.toString();
		st=st.replaceAll(Pattern.quote("{{"+"id"+"}}"), "6");
		st=st.replaceAll(Pattern.quote("{{"+"title"+"}}"), "physics");
		st=st.replaceAll(Pattern.quote("{{"+"author"+"}}"), "H C Verma");
		
		RequestSpecification request=RestAssured.given();
		request.header("Content-type","application/json");
		request.body(st);
		Response resp=request.post("http://localhost:3000/posts");
		int code= resp.getStatusCode();
		System.out.println("Status is: "+code);
		//assert.assertEquals(code, 201);
		
	}


}
