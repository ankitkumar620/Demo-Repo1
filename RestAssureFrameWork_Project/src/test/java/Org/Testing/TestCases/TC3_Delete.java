package Org.Testing.TestCases;



import java.io.IOException;
import java.util.Properties;

import Org.Testing.TestResponseValidation.ResponseValidations;
import Org.Testing.TestSteps.HttpMethods;
import Org.Testing.TestUtilities.PropertiesFileLoad;
import io.restassured.response.Response;
import Org.Testing.TestUtilities.PropertiesFileLoad;
public class TC3_Delete {
	
	public void TC3_DeleteMethod() throws IOException
	{
		//Step 1: Load the Property file in the Object of Property class Pr
		Properties Pr=PropertiesFileLoad.PropFileLoad("C:\\Users\\Ank\\Automation\\seleniumTest\\RestAssureFrameWork_Project\\Env.properties");
		//Step 2: Initialize the Properties object of HttpMethods Class with Pr of Step 1.
		HttpMethods http=new HttpMethods(Pr);
		/*Step 3: Called DeleteData method of class HttpMethods which will delete the data
		and will return the response of the delete request */
		Response Res= http.DeleteData(TC2_Post.JsonKeyValue,"QA_URI1");
		//Step 4: Res is sent to the ResponseValidation method of class ResponseValidations
		ResponseValidations.ResponseStatusCodeVal(200,Res);
		System.out.println("Data Deleted Succesfully : "+Res.getStatusCode());
	}

}
