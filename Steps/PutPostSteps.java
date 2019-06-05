package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.HashMap;
import java.util.Map;


public class PutPostSteps {

    private RequestSpecification request;

    @Given("^I perform A PUT request for \"([^\"]*)\"$")
    public void iPerformARequestFor(String  url) throws Throwable {
        Map<String, String> postContent = new HashMap<>();
        postContent.put("name","HelloWorld");
        request = (RequestSpecification) RestAssured.given().contentType(ContentType.JSON).with().body(postContent);

    }


    @When("^I perform PUT request  with the name of \"([^\"]*)\"$")
    public void iPerformPUTRequestWithTheNameOf(String number) throws Throwable {


        Map<String, String> postContent = new HashMap<>();
        postContent.put("name","HelloWorld");

        Response response = request.with().body(postContent).when().put("http://localhost:3000/comments/1");

    }

    @Then("^I should see the comment content as \"([^\"]*)\"$")
    public void iShouldSeeTheCommentContentAs(String Number) throws Throwable {

    }



}
