package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class PostSteps {

    private RequestSpecification request;
    private Response response;

    @Given("^I perform POST request for \"([^\"]*)\"$")
    public void iPerformPOSTRequestFor(String url) throws Throwable {


        Map<String, String> postContent = new HashMap<>();
        postContent.put("name","Hassanine");
        request = given().contentType(ContentType.JSON).with().body(postContent);

    }

    @When("^I perform a POST request with the name \"([^\"]*)\"$")
    public void iPerformAPOSTRequestWithTheName(String name) throws Throwable {


        Map<String, String> postContent = new HashMap<>();
        postContent.put("name","Hassanine");

        Response response = request.with().body(postContent).when().post("http://localhost:3000/profile");
    }

    @Then("^I should see the name \"([^\"]*)\"$")
    public void iShouldSeeTheName(String name) throws Throwable {


    }
}
