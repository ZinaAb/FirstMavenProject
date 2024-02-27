package step_definitions;

import org.junit.Assert;

import Page.SauceDemoLoginPage;
import Page.SauceHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DataReader;
import utils.Driver;

public class SauceDemoTest {
	
	SauceDemoLoginPage sauceloginpage = new SauceDemoLoginPage();
	SauceHomePage homepage = new SauceHomePage();
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
	    Driver.getDriver().get(DataReader.getProperty("sauce_url"));
	}

	@When("user enters a valid user name and valid password")
	public void user_enters_a_valid_user_name_and_valid_password() {
	    sauceloginpage.loginUsername.sendKeys(DataReader.getProperty("sauce_username"));
	    sauceloginpage.loginPassword.sendKeys(DataReader.getProperty("sauce_password"));
	}

	@When("user clicks on the signin button")
	public void user_clicks_on_the_signin_button() {
		sauceloginpage.loginBtn.click();
	}

	@Then("user is logged successfully")
	public void user_is_logged_successfully() throws InterruptedException {
		Thread.sleep(2000);
	    Assert.assertTrue(homepage.homepage_product_text.isDisplayed());
	}




}
