package frameWork_driver_utilities;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class BrowserUtils {
	
	//public static void main (String[] args) throws InterruptedException {	
		//alert_accept();
	//}
	static Alert alert;
	
		
	// create a utility method that accepts the Alert
	   //hint: create a method that has a WedDriver as a parameter and does the alert accept
	public static void alert_accept(WebDriver driver) {
		alert = driver.switchTo().alert();
		alert.accept();
	}
	
	// create a utility method that cancels the Alert
	public static void alert_cancel(WebDriver driver) {
		alert = driver.switchTo().alert();
		alert.dismiss();
	}
	
	// create a utility method that sendKeys to the Alert
	public static void alert_sendKey(WebDriver driver, String input) {
		alert = driver.switchTo().alert();
		alert.sendKeys(input);
	}
	
	// create a utility method that gets the text of the Alert and returns it
	public static String alert_getText(WebDriver driver) {
		alert = driver.switchTo().alert();
		return alert.getText();
	}

	
}

