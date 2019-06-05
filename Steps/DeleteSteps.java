package Steps;

import com.jayway.restassured.http.ContentType;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.RestAssured.when;

public class DeleteSteps {
    @Given("^I perform Delete operation for \"([^\"]*)\"$")
    public void iPerformDeleteOperationFor(String url) throws Throwable {
        given().contentType(ContentType.JSON);

    }

    @And("^I perform Delete for the post number \"([^\"]*)\"$")
    public void iPerformDeleteForThePostNumber(String deleteNumber) throws Throwable {
        when().delete("http://localhost:3000/profile/10").then().statusCode(200);
    }

    @Then("^I should see the status as \"([^\"]*)\"$")
    public void iShouldSeeTheStatusAs(String arg0) throws Throwable {

    }
}
