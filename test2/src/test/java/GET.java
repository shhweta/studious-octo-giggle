import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;


public class GET {
	
	@Test
	void test_1()
	{
	Response response = get("https://reqres.in/api/users?page=2");
	
	 System.out.println(response.asString());
	 System.out.println(response.getBody());
	 System.out.println(response.getStatusCode());
	 System.out.println(response.getStatusLine());
	 System.out.println(response.getHeader("Content-Type"));
	 System.out.println(response.getTime());
	 
	 int statusCode =response.getStatusCode() ;
	 
	 Assert.assertEquals(statusCode, 200);
	
	}
	
	@Test
	void test_2()
	{
		//random url 
		given().get("https://reqres.in/api/users?page=2")
		.then()
		.statusCode(200)
		.body("sqOfflineStoreTransactionList.id", equalTo("1428270"));
		
	}
	

}
