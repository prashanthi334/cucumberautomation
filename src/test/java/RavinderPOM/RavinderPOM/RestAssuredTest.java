package RavinderPOM.RavinderPOM;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;

public class RestAssuredTest {

	
//@Test
//public void testGetAPI() {
//	
//	RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
//	
//	Response rs = RestAssured.given().request(Method.GET,"/employees");
//	
//	System.out.println(rs.getStatusCode());
//	System.out.println(rs.getBody().asString());
//	
//}


	@Test
	public void testPostAPI() {
	
	RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
	
	String payload = "{\"name\":\"test\",\"salary\":\"123\",\"age\":\"23\"}";
	
	Response rs = RestAssured.given().body(payload).request(Method.POST,"/create");
	System.out.println(rs.getStatusCode());
	System.out.println(rs.getBody().asString());
	
}
}
