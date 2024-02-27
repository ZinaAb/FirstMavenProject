package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class SauceDemoLoginPage {

	//How do we create a page class
	
	//1. we need a class for a page of the application 
	
	
	//2. we need to create a constructor with page factory of selenium
	
	public SauceDemoLoginPage () {
		PageFactory.initElements(Driver.getDriver(),this);
	}
	
	
	//3. then collect the web elements
	@FindBy(id ="user-name")
	public WebElement loginUsername;
	
	@FindBy(id ="password")
	public WebElement loginPassword;
	
	@FindBy(xpath = "//input[@id='login-button']")
	public WebElement loginBtn;
	
	@FindBy(css = "h3[data-test='error']")
	public WebElement loginEmptyError;
	
	
	
		
		
	

}