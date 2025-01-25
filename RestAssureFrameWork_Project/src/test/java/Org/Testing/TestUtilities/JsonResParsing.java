package Org.Testing.TestUtilities;

import io.restassured.response.Response;

public class JsonResParsing {
	public static String JsonResDataParsing(Response Res,String JsonPath) 
	{
		String JSONParseKeyValue = Res.jsonPath().get(JsonPath).toString();
		
		return JSONParseKeyValue;
		
	}

}
