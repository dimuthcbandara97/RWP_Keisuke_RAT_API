import java.net.http.HttpRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_003_DELETE_request {
	
	// Drivers
	String driverString = "http://keisukebackend-env.eba-bnawaywp.us-east-1.elasticbeanstalk.com/admin/api/v1/drivers/remove/1";
	// Good Categroies
	String categorieString = "http://keisukebackend-env.eba-bnawaywp.us-east-1.elasticbeanstalk.com/admin/api/v1/good-categories/remove/1";
	// Managers
	String managerString = "http://keisukebackend-env.eba-bnawaywp.us-east-1.elasticbeanstalk.com/admin/api/v1/managers/remove/1";
	// Goods
	String goodString = "http://keisukebackend-env.eba-bnawaywp.us-east-1.elasticbeanstalk.com/admin/api/v1/goods/remove/1";
	// Shops
	String shopString = "http://keisukebackend-env.eba-bnawaywp.us-east-1.elasticbeanstalk.com/admin/remove/1";
	
	// Driver
	@Test
	void del_driver()
	{
		System.out.println("*********Checking DELETE Methods*******");
		System.out.println("");
		// speciby base URL
		RestAssured.baseURI = driverString;
		
		// Request object
		RequestSpecification httpRequestSpecification = RestAssured.given();
		
		// Response Object
		Response response = httpRequestSpecification.request(Method.DELETE,"");
		
		// Print response in consloe window
		String responseBodyString =  response.getBody().asString();
		System.out.println("Drivers Respose body is :"+responseBodyString);
		
		
		// status code validation starts here
		int statusCode =  response.getStatusCode();
		System.out.println("Drivers Status Code is :"+ statusCode);
		Assert.assertEquals(statusCode, 200);
		
		//status line verification
		String statusLineString = response.getStatusLine();
		System.out.println("Drivers Status Line Is:" + statusLineString);
//		Assert.assertEquals(statusLineString, "HTTP/1.1 200");
		System.out.println("**********************************************************");
	}
	
	// Good Categroies
	@Test
	void del_good_categories()
	{
		System.out.println("*********Checking DELETE Methods*******");
		System.out.println("");
		// speciby base URL
		RestAssured.baseURI = categorieString;
		
		// Request object
		RequestSpecification httpRequestSpecification = RestAssured.given();
		
		// Response Object
		Response response = httpRequestSpecification.request(Method.DELETE,"");
		
		// Print response in consloe window
		String responseBodyString =  response.getBody().asString();
		System.out.println("Categories Respose body is :"+responseBodyString);
		
		
		// status code validation starts here
		int statusCode =  response.getStatusCode();
		System.out.println("Categories Status Code is :"+ statusCode);
		Assert.assertEquals(statusCode, 200);
		
		//status line verification
		String statusLineString = response.getStatusLine();
		System.out.println("Categories Status Line Is:" + statusLineString);
//		Assert.assertEquals(statusLineString, "HTTP/1.1 200");
		System.out.println("**********************************************************");
	}
	
	// Managers
	@Test
	void del_managers()
	{
		System.out.println("*********Checking DELETE Methods*******");
		System.out.println("");
		// speciby base URL
		RestAssured.baseURI = managerString;
		
		// Request object
		RequestSpecification httpRequestSpecification = RestAssured.given();
		
		// Response Object
		Response response = httpRequestSpecification.request(Method.DELETE,"");
		
		// Print response in consloe window
		String responseBodyString =  response.getBody().asString();
		System.out.println("Manager Respose body is :"+responseBodyString);
		
		
		// status code validation starts here
		int statusCode =  response.getStatusCode();
		System.out.println("Manager Status Code is :"+ statusCode);
		Assert.assertEquals(statusCode, 200);
		
		//status line verification
		String statusLineString = response.getStatusLine();
		System.out.println("Manager Status Line Is:" + statusLineString);
//		Assert.assertEquals(statusLineString, "HTTP/1.1 200");
		System.out.println("**********************************************************");
	}
	
	// Goods
	@Test
	void del_goods()
	{
		System.out.println("*********Checking DELETE Methods*******");
		System.out.println("");
		// speciby base URL
		RestAssured.baseURI = goodString;
		
		// Request object
		RequestSpecification httpRequestSpecification = RestAssured.given();
		
		// Response Object
		Response response = httpRequestSpecification.request(Method.DELETE,"");
		
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
	
	// Shops
	
	@Test
	void del_shops()
	{
		System.out.println("*********Checking DELETE Methods*******");
		System.out.println("");
		// speciby base URL
		RestAssured.baseURI = shopString;
		
		// Request object
		RequestSpecification httpRequestSpecification = RestAssured.given();
		
		// Response Object
		Response response = httpRequestSpecification.request(Method.DELETE,"");
		
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
