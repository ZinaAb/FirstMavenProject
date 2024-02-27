package page_obeject_model;

import Page.SauceDemoLoginPage;

import utils.BrowserUtils;
import utils.DataReader;
import utils.Driver;


public class SaucePageObjectDemo {
	
	public static void main(String[] args) throws InterruptedException {
		sauceLoginDemo();
	}
	public static void sauceLoginDemo() throws InterruptedException {
		SauceDemoLoginPage loginPage = new  SauceDemoLoginPage ();
		BrowserUtils utils = new BrowserUtils();
		
		//go to website
		Driver.getDriver().get(DataReader.getProperty("sauce_url"));
		//wait for the username field to be visible
		utils.waitForElementToBeVisible(loginPage.loginUsername);
		
		
		
		//this will highlight it
		utils.highlightElement(loginPage.loginUsername);
		//type username
		loginPage.loginUsername.sendKeys(DataReader.getProperty("sauce_username"));
		
		//type password
		loginPage.loginPassword.sendKeys(DataReader.getProperty("sauce_password"));
		
		//click signin
		loginPage.loginBtn.click();
		
		//Driver.quitDriver();
	}
}