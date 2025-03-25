import com.sun.org.apache.xerces.internal.xinclude.XIncludeHandler;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserApiTest {

    private static final String BASE_URL = "https://reqres.in";
    private static int userId;

    @BeforeClass
    public void setup() {
        // Initialize base URL for RestAssured
        XIncludeHandler.Notation RestAssured;
        RestAssured.baseURI = BASE_URL;
    }

    @Test(priority = 1)
    public void createUser() {
        // POST request to create a user
        String requestBody = "{ \"name\": \"morpheus\", \"job\": \"leader\" }"; // Fixed the JSON string
        Response response = RestAssured.given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .post("/api/users");

        // Validate the response status code and body
        Assert.assertEquals(response.statusCode(), 201);
        Assert.assertTrue(response.jsonPath().getString("name").equals("morpheus"));
        Assert.assertTrue(response.jsonPath().getString("job").equals("leader"));

        // Capture the user ID for further testing
        userId = response.jsonPath().getInt("id");
    }

    @Test(priority = 2, dependsOnMethods = "createUser")
    public void retrieveUser() {
        // GET request to retrieve user by ID
        Response response = RestAssured.given()
                .get("/api/users/" + userId);

        // Validate response status code and body
        Assert.assertEquals(response.statusCode(), 200);
        // Fix: The returned field is "data.name", not "data.first_name"
        Assert.assertTrue(response.jsonPath().getString("data.name").equals("morpheus"));
    }

    @Test(priority = 3, dependsOnMethods = "retrieveUser")
    public void updateUser() {
        // PUT request to update user details
        String updatedRequestBody = "{ \"name\": \"Ahmed\", \"job\": \"Tester\" }"; // Fixed extra space
        Response response = RestAssured.given()
                .header("Content-Type", "application/json")
                .body(updatedRequestBody)
                .put("/api/users/" + userId);

        // Validate that the response status code is 200 and the details were updated
        Assert.assertEquals(response.statusCode(), 200);
        Assert.assertTrue(response.jsonPath().getString("name").equals("Ahmed"));
        Assert.assertTrue(response.jsonPath().getString("job").equals("Tester"));
    }
}