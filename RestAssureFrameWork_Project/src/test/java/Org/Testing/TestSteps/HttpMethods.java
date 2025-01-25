package Org.Testing.TestSteps;

import java.util.Properties;

import Org.Testing.Payloads.PojoBodyData;
import io.restassured.response.Response;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class HttpMethods
{
  static Properties Pr;
   public HttpMethods(Properties Pr)
    {
    this.Pr=Pr;
    }
   	public static Response GetRequest(String id,String URI)
   		{
   		String FinalURI=(String)Pr.getProperty(URI)+"/"+id;
   			Response Res=given()
   						.contentType(ContentType.JSON)
   						.when()
   						.get(Pr.getProperty(FinalURI));
   			return Res;
}
   	
public Response PostRequest(PojoBodyData Body, String URI)
   	{
	
   	Response Res=
   	given()
   	.contentType(ContentType.JSON)
   	.body(Body)
   	.when()
   	.post(Pr.getProperty(URI));
   	return Res;
   	}

public Response PutRequest(PojoBodyData Body, String URI, String id)
	{
String FinalURI=(String)Pr.getProperty(URI)+"/"+id;
	Response Res=
	given()
	.contentType(ContentType.JSON)
	.body(Body)
	.when()
	.post(Pr.getProperty(FinalURI));
	return Res;
	}

public Response DeleteData(String id, String URI)
	{
	
	String FinalUri=(String)Pr.getProperty(URI)+"/"+id;
	Response Res=
	given()
	.contentType(ContentType.JSON)
	.when()
	.delete(FinalUri);
	return Res;
	}
}
