package ApiCalls;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ApiCalls {
	

		@Test
		
		public void get_call() {
			
			JSONObject request = new JSONObject();
			baseURI = "https://reqres.in/api";
		    given().get("users?page=2").then().statusCode(200).body("data[1].id", equalTo(8));
			RequestSpecification httpRequest = RestAssured.given();
			Response response = httpRequest.get("/users?page=2");
			ResponseBody body = response.getBody();
			System.out.println("This is Get Call");
			System.out.println("Response Body is: " + body.asString());
			
		}
		
		@Test
		
		public void post_call() {
			
		JSONObject request = new JSONObject();
		
			
			request.put("name", "ak");
			request.put("job", "QA");
			
			
		//	System.out.println(request.toJSONString());
			
			baseURI = "https://reqres.in/api";
			
			System.out.println("\n\n\n This is Post Call");
			
			given().body(request.toJSONString()).when().post("/users").then().statusCode(201).log().all();
			
			
		}
		
		@Test
		
		public void put_call() {
			
		JSONObject request = new JSONObject();
		
			request.put("name", "ak");
			request.put("job", "QA");
			
			
			//System.out.println(request.toJSONString());
			
			baseURI = "https://reqres.in/api";
			
			System.out.println("\n\n\nThis is Put Call");
			
			given().body(request.toJSONString()).when().put("users/2").then().statusCode(200).log().all();
			
			
		}
		
	@Test
		
		public void patch_call() {
			
		JSONObject request = new JSONObject();
		
			request.put("name", "ak");
			request.put("job", "QA");
			
			baseURI = "https://reqres.in/api";
			
			System.out.println("\n\n\n This is Patch Call");
			
			given().body(request.toJSONString()).when().patch("users/2").then().statusCode(200).log().all();
			
			
		}

	@Test
	public void delete_call() {
		
		JSONObject request = new JSONObject();
			
			
			baseURI = "https://reqres.in/api";
			
			System.out.println("\n\n\n This is Delete Call");
			
			given().body(request.toJSONString()).when().delete("users/2").then().statusCode(204).log().all();
			
			
		}

	}




