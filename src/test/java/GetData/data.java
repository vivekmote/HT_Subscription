package GetData;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class data {
	
	@Test(priority = 0)
	public void testResponseCode()
	{
		Response response=RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=439d4b804bc8187953eb36d2a8c26a02");
		int code= response.getStatusCode();
		System.out.println("Status code:"+code);
		Assert.assertEquals(code, 200);
	}
	
	@Test(priority = 1)
	public void testBody()
	{
		Response response=RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=439d4b804bc8187953eb36d2a8c26a02");
		String data= response.asString();
		System.out.println("Data :"+ data);
		
	}
	
	
	
	
	

}
