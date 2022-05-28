package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static  io.restassured.RestAssured.*;
import static        io.restassured.matcher.RestAssuredMatchers.*;
import static        org.hamcrest.Matchers.*;

public class ApiStepDefs {


    RequestSpecification requestSpecification;
    Response response;

    @Given("The baseuri is set")
    public void the_baseuri_is_set() {
       baseURI = "https://api.github.com";


    }


    @Given("Header is set to {string} and {string} and Path parameter is set to {string} and {string}")
    public void header_is_set_to_and(String key, String value, String key1, String value1) {
       requestSpecification = given().
                                    header(key, value).
                                    pathParam(key1, value1);

    }


    @When("I send a GET request to {string}")
    public void i_send_a_get_request_to(String endpoint) {
        response = requestSpecification.when().log().all().
                                        get(endpoint);
    }
    @Then("The status code should be {int} and The body is {string} and {string}")
    public void the_status_code_should_be(Integer status, String a, String b) {
        response. then().log().all().
                    statusCode(is(status)).
                    body(a, equalTo(b));
    }




}
