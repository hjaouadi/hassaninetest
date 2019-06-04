package Steps;

import com.jayway.restassured.http.ContentType;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.RestAssured.when;
import static org.hamcrest.core.Is.is;

public class GetPostSteps {
    @Given("^I perform GET operation for \"([^\"]*)\"$")
    public void iPerformGETOperationFor(String url) throws Throwable {
        given().contentType(ContentType.JSON);
    }

    @And("^I perfor GET for the post number \"([^\"]*)\"$")
    public void iPerforGETForThePostNumber(String postNumber) throws Throwable {
        when().get("http://localhost:3000/posts/1")
                .then().body("author", is("typicode"));
    }

    @Then("^I should see the author name as \"([^\"]*)\"$")
    public void iShouldSeeTheAuthorNameAs(String arg0) throws Throwable {

    }
}