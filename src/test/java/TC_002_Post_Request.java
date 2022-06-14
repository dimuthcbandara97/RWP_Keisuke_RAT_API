import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;



public class TC_002_Post_Request {
	
	// Drivers
	String driverString = "http://keisukebackend-env.eba-bnawaywp.us-east-1.elasticbeanstalk.com/admin/api/v1/drivers";
	// Good Categories
	String goodCategorieString = "http://keisukebackend-env.eba-bnawaywp.us-east-1.elasticbeanstalk.com/admin/api/good-categories";
	// Managers
	String managerString = "http://keisukebackend-env.eba-bnawaywp.us-east-1.elasticbeanstalk.com/admin/api/v1/managers";
	// Goods
	String goodString = "http://keisukebackend-env.eba-bnawaywp.us-east-1.elasticbeanstalk.com/admin/api/v1/goods";
	// Shops
	String shopString = "http://keisukebackend-env.eba-bnawaywp.us-east-1.elasticbeanstalk.com/admin/api/v1/shops";
	
	
	// Drivers
	@Test
	void registrationSuccessful_Driver()
	{
		// speciby base URL
		RestAssured.baseURI = driverString;
		
		// Request object
		RequestSpecification httpRequestSpecification = RestAssured.given();
		
		// Response Object
		
		//Request payload sending along with post request
		JSONObject reqestParamsJsonObject = new JSONObject();
		
		reqestParamsJsonObject.put("firstName", "Testing RAT");
		reqestParamsJsonObject.put("secondName", "Testing RAT");
		reqestParamsJsonObject.put("nicOrEic", "97******V");
		reqestParamsJsonObject.put("dialCode", 94);
		reqestParamsJsonObject.put("contactNumber", 037313);
		reqestParamsJsonObject.put("addressLineOne", "ADD01_T_RAT");
		reqestParamsJsonObject.put("addressLineTwo", "ADD02_T_RAT");
		reqestParamsJsonObject.put("addressLineThree", "ADD03_T_RAT");
		
		httpRequestSpecification.header("Content-Type","application/json");
		
		httpRequestSpecification.body(reqestParamsJsonObject.toJSONString()); // attach above data to the request
		
		Response response = httpRequestSpecification.request(Method.POST,"/register");
		
		// Print response in consloe window
		String responseBodyString =  response.getBody().asString();
		System.out.println("Drivers Respose body is :"+responseBodyString);
		
		
		// status code validation starts here
		int statusCode =  response.getStatusCode();
		System.out.println("Drivers Status Code is :"+ statusCode);
		Assert.assertEquals(statusCode, 200);
		
		// Success Code Vslidation
		String successCodeString =  response.jsonPath().get("SucessCode");
		Assert.assertEquals(successCodeString, "OPERATION_SUCCESS");

	}
	// Good Categories
	@Test
	void registrationSuccessful_Good_Categories()
	{
		// speciby base URL
		RestAssured.baseURI = goodCategorieString;
		
		// Request object
		RequestSpecification httpRequestSpecification = RestAssured.given();
		
		// Response Object
		
		//Request payload sending along with post request
		JSONObject reqestParamsJsonObject = new JSONObject();
		
		reqestParamsJsonObject.put("categoryName", "Testing RAT");
		
		httpRequestSpecification.header("Content-Type","application/json");
		
		httpRequestSpecification.body(reqestParamsJsonObject.toJSONString()); // attach above data to the request
		
		Response response = httpRequestSpecification.request(Method.POST,"/register");
		
		// Print response in consloe window
		String responseBodyString =  response.getBody().asString();
		System.out.println("Category Respose body is :"+responseBodyString);
		
		
		// status code validation starts here
		int statusCode =  response.getStatusCode();
		System.out.println("Category Status Code is :"+ statusCode);
		Assert.assertEquals(statusCode, 200);
		
		// Success Code Vslidation
		String successCodeString =  response.jsonPath().get("SucessCode");
		Assert.assertEquals(successCodeString, "OPERATION_SUCCESS");

	}
	
	// Manager
	@Test
	void registrationSuccessful_Manager()
	{
		// speciby base URL
		RestAssured.baseURI = managerString;
		
		// Request object
		RequestSpecification httpRequestSpecification = RestAssured.given();
		
		// Response Object
		
		//Request payload sending along with post request
		JSONObject reqestParamsJsonObject = new JSONObject();
		
		reqestParamsJsonObject.put("firstName", "Testing RAT");
		reqestParamsJsonObject.put("secondName", "Testing RAT");
		reqestParamsJsonObject.put("nicOrEic", "97******V");
		reqestParamsJsonObject.put("dialCode", 94);
		reqestParamsJsonObject.put("contactNumber", 037313);
		reqestParamsJsonObject.put("addressLineOne", "ADD01_T_RAT_2");
		reqestParamsJsonObject.put("addressLineTwo", "ADD02_T_RAT_2");
		reqestParamsJsonObject.put("addressLineThree", "ADD03_T_RAT_2");
		
		httpRequestSpecification.header("Content-Type","application/json");
		
		httpRequestSpecification.body(reqestParamsJsonObject.toJSONString()); // attach above data to the request
		
		Response response = httpRequestSpecification.request(Method.POST,"/register");
		
		// Print response in consloe window
		String responseBodyString =  response.getBody().asString();
		System.out.println("Manager Respose body is :"+responseBodyString);
		
		
		// status code validation starts here
		int statusCode =  response.getStatusCode();
		System.out.println("Manager Status Code is :"+ statusCode);
		Assert.assertEquals(statusCode, 200);
		
		// Success Code Vslidation
		String successCodeString =  response.jsonPath().get("SucessCode");
		Assert.assertEquals(successCodeString, "OPERATION_SUCCESS");

	}
	
	// Goods
	@Test
	void registrationSuccessful_Goods()
	{
		// speciby base URL
		RestAssured.baseURI = goodString;
		
		// Request object
		RequestSpecification httpRequestSpecification = RestAssured.given();
		
		// Response Object
		
		//Request payload sending along with post request
		JSONObject reqestParamsJsonObject = new JSONObject();
		
		reqestParamsJsonObject.put("itemName", "Testing RAT");
		reqestParamsJsonObject.put("amount", 129);
		reqestParamsJsonObject.put("grossWeigh",250 );
		reqestParamsJsonObject.put("capacity", 94);
		reqestParamsJsonObject.put("categoryId", 1);
		
		httpRequestSpecification.header("Content-Type","application/json");
		
		httpRequestSpecification.body(reqestParamsJsonObject.toJSONString()); // attach above data to the request
		
		Response response = httpRequestSpecification.request(Method.POST,"/register");
		
		// Print response in consloe window
		String responseBodyString =  response.getBody().asString();
		System.out.println("Goods Respose body is :"+responseBodyString);
		
		
		// status code validation starts here
		int statusCode =  response.getStatusCode();
		System.out.println("Goods Status Code is :"+ statusCode);
		Assert.assertEquals(statusCode, 200);
		
		// Success Code Vslidation
		String successCodeString =  response.jsonPath().get("SucessCode");
		Assert.assertEquals(successCodeString, "OPERATION_SUCCESS");

	}
	
	// Shops
	@Test
	void registrationSuccessful_Shops()
	{
		// speciby base URL
		RestAssured.baseURI = shopString;
		
		// Request object
		RequestSpecification httpRequestSpecification = RestAssured.given();
		
		// Response Object
		
		//Request payload sending along with post request
		JSONObject reqestParamsJsonObject = new JSONObject();
		
		reqestParamsJsonObject.put("identityName", "Testing RAT");
		reqestParamsJsonObject.put("brNumber", "Testing RAT");
		reqestParamsJsonObject.put("dialCode", 94);
		reqestParamsJsonObject.put("contactNumber", 1222);
		reqestParamsJsonObject.put("addressLineOne", "ADD01_T_RAT");
		reqestParamsJsonObject.put("addressLineTwo", "ADD02_T_RAT");
		reqestParamsJsonObject.put("addressLineThree", "ADD03_T_RAT");
		reqestParamsJsonObject.put("longitude", "LON_RAT");
		reqestParamsJsonObject.put("latitude", "LAT_RAT");
		
		httpRequestSpecification.header("Content-Type","application/json");
		
		httpRequestSpecification.body(reqestParamsJsonObject.toJSONString()); // attach above data to the request
		
		Response response = httpRequestSpecification.request(Method.POST,"/register");
		
		// Print response in consloe window
		String responseBodyString =  response.getBody().asString();
		System.out.println("Shops Respose body is :"+responseBodyString);
		
		
		// status code validation starts here
		int statusCode =  response.getStatusCode();
		System.out.println("Shops Status Code is :"+ statusCode);
		Assert.assertEquals(statusCode, 200);
		
		// Success Code Vslidation
		String successCodeString =  response.jsonPath().get("SucessCode");
		Assert.assertEquals(successCodeString, "OPERATION_SUCCESS");

	}
	
	
}
