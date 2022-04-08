package DeleteData;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class data {

	@Test
	public void deletedata()
	{
		RequestSpecification request= RestAssured.given();
		Response response= request.delete("https://reqres.in/api/users/2");
		
		int code= response.getStatusCode();
		Assert.assertEquals(code, 200);
	}
	

}
