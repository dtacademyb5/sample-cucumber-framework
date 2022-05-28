package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.Keys;
import pages.SignInPage;
import utils.Driver;
import utils.PropertyReader;

public class LoginStepDefs {






    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {

        Driver.getDriver().get(PropertyReader.readProperty("url"));


    }
    @When("I enter the valid credentials")
    public void i_enter_the_valid_credentials() {
        SignInPage signInPage =  new SignInPage();
        signInPage.emailLogin.sendKeys(PropertyReader.readProperty("email"));
        signInPage.passLogin.sendKeys(PropertyReader.readProperty("pass") + Keys.ENTER);
    }
    @Then("I should be able to login")
    public void i_should_be_able_to_login() {


        Assert.assertEquals("BCHd", Driver.getDriver().getTitle());

    }


    @When("I enter the {string} and {string}")
    public void i_enter_the_and(String email, String pass) {


        SignInPage signInPage =  new SignInPage();
        signInPage.emailLogin.sendKeys(email);
        signInPage.passLogin.sendKeys(pass + Keys.ENTER);


    }

}
