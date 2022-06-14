import java.net.http.HttpRequest;
import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_001_GET_request_By_ID {
	
//	http://194.163.34.223:8082/swagger-ui/
	
//	String good_catergorieString = "http://keisukebackend-env.eba-bnawaywp.us-east-1.elasticbeanstalk.com/admin/api/v1/good-categories/1";
//	String driverString = "http://keisukebackend-env.eba-bnawaywp.us-east-1.elasticbeanstalk.com/admin/api/v1/drivers/1";
//	String goodString = "http://keisukebackend-env.eba-bnawaywp.us-east-1.elasticbeanstalk.com/admin/api/v1/goods/1";
//	String managerString = "http://keisukebackend-env.eba-bnawaywp.us-east-1.elasticbeanstalk.com/admin/api/v1/managers/1";
//	String shopssString = "http://keisukebackend-env.eba-bnawaywp.us-east-1.elasticbeanstalk.com/admin/api/v1/shops/1";

	String good_catergorieString = "http://194.163.34.223:8082/swagger-ui//admin/api/v1/good-categories/1";
	String driverString = "http://194.163.34.223:8082/swagger-ui/admin/api/v1/drivers/1";
	String goodString = "http://194.163.34.223:8082/swagger-ui/admin/api/v1/goods/1";
	String managerString = "http://194.163.34.223:8082/swagger-ui/admin/api/v1/managers/1";
	String shopssString = "http://194.163.34.223:8082/swagger-ui/admin/api/v1/shops/1";

	@Test
	void get_Good_Categories()
	{
		System.out.println("*********Checking Get Methods*******");
		System.out.println("");
		// speciby base URL
		RestAssured.baseURI = good_catergorieString;
		
		// Request object
		RequestSpecification httpRequestSpecification = RestAssured.given();
		
		// Response Object
		Response response = httpRequestSpecification.request(Method.GET,"");
		
		// Print response in consloe window
		String responseBodyString =  response.getBody().asString();
		System.out.println("Good Categories Respose body is :"+responseBodyString);
		
		
		// status code validation starts here
		int statusCode =  response.getStatusCode();
		System.out.println("Good Categories Status Code is :"+ statusCode);
		Assert.assertEquals(statusCode, 200);
		
		//status line verification
		String statusLineString = response.getStatusLine();
		System.out.println("Good Categories Status Line Is:" + statusLineString);
//		Assert.assertEquals(statusLineString, "HTTP/1.1 200");
		System.out.println("**********************************************************");
	}
	
	// Driver
	@Test
	void get_Drivers()
	{
		// speciby base URL
		RestAssured.baseURI = driverString;
		
		// Request object
		RequestSpecification httpRequestSpecification = RestAssured.given();
		
		// Response Object
		Response response = httpRequestSpecification.request(Method.GET,"");
		
		// Print response in consloe window
		String responseBodyString =  response.getBody().asString();
		System.out.println("Driver Respose body is :"+responseBodyString);
		
		
		// status code validation starts here
		int statusCode =  response.getStatusCode();
		System.out.println("Driver Starus Code is :"+ statusCode);
		Assert.assertEquals(statusCode, 200);
		
		//status line verification
		String statusLineString = response.getStatusLine();
		System.out.println("Driver Status Line Is:" + statusLineString);
//		Assert.assertEquals(statusLineString, "HTTP/1.1 200");
		System.out.println("**********************************************************");
	}
	
	// Goods
	@Test
	void get_Goods()
	{
		// speciby base URL
		RestAssured.baseURI = goodString;
		
		// Request object
		RequestSpecification httpRequestSpecification = RestAssured.given();
		
		// Response Object
		Response response = httpRequestSpecification.request(Method.GET,"");
		
		// Print response in consloe window
		String responseBodyString =  response.getBody().asString();
		System.out.println("Goods Respose body is :"+responseBodyString);
		
		
		// status code validation starts here
		int statusCode =  response.getStatusCode();
		System.out.println("Goods Status Code is :"+ statusCode);
		Assert.assertEquals(statusCode, 200);
		
		//status line verification
		String statusLineString = response.getStatusLine();
		System.out.println("Goods Status Line Is:" + statusLineString);
//		Assert.assertEquals(statusLineString, "HTTP/1.1 200");
		System.out.println("**********************************************************");
	}
	
	// Manager
	@Test
	void get_Managet()
	{
		// speciby base URL
		RestAssured.baseURI = managerString;
		
		// Request object
		RequestSpecification httpRequestSpecification = RestAssured.given();
		
		// Response Object
		Response response = httpRequestSpecification.request(Method.GET,"");
		
		// Print response in consloe window
		String responseBodyString =  response.getBody().asString();
		System.out.println("Manager Respose body is :"+responseBodyString);
		
		
		// status code validation starts here
		int statusCode =  response.getStatusCode();
		System.out.println("Manager Starus Code is :"+ statusCode);
		Assert.assertEquals(statusCode, 200);
		
		//status line verification
		String statusLineString = response.getStatusLine();
		System.out.println("Manager Status Line Is:" + statusLineString);
//		Assert.assertEquals(statusLineString, "HTTP/1.1 200");
		System.out.println("**********************************************************");
	}
	
	// Shops
	@Test
	void get_Shops()
	{
		// speciby base URL
		RestAssured.baseURI = shopssString;
		
		// Request object
		RequestSpecification httpRequestSpecification = RestAssured.given();
		
		// Response Object
		Response response = httpRequestSpecification.request(Method.GET,"");
		
		// Print response in consloe window
		String responseBodyString =  response.getBody().asString();
		System.out.println("Shops Respose body is :"+responseBodyString);
		
		
		// status code validation starts here
		int statusCode =  response.getStatusCode();
		System.out.println("Shops Status Code is :"+ statusCode);
		Assert.assertEquals(statusCode, 200);
		
		//status line verification
		String statusLineString = response.getStatusLine();
		System.out.println("Shops Status Line Is:" + statusLineString);
//		Assert.assertEquals(statusLineString, "HTTP/1.1 200");
		System.out.println("**********************************************************");
	}
}
