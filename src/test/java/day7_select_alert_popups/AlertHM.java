package day7_select_alert_popups;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class AlertHM {
	
	public static void main (String[] args) {	
		
		alert();
	}
	
	public static void alert() {
		
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	
	//Test case 3
	//go to https://demoqa.com/alerts 
	driver.get("https://demoqa.com/alerts");
	
	//Click on the third 'Click me' button and get the text of it, 
	driver.findElement(By.id("confirmButton")).click();
	
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	wait.until(ExpectedConditions.alertIsPresent());
	
	Alert handle = driver.switchTo().alert();
	String alertText = handle.getText();
	
	//Then verify if the text equals to "Do you confirm action?", 
	if (alertText.equals("Do you confirm action?")) {
		System.out.println("pass");
		
	}else {
		System.out.println("fail");
	}
	// if true, dismiss the Alert, 
		handle.dismiss();
	
	//	then verify "You selected Cancel" text displayed.
		if (alertText.equals("You selected Cancel")) {
			System.out.println("pass");
			
		}else {
		System.out.println("Fail");
		
		//Test case 4
		//go to https://demoqa.com/alerts 
	//	driver.get("https://demoqa.com/alerts");
		
		//Click on the 'Prompt Alert' button and type PrimeTech. Then accept the Alert.
	//	driver.findElement(By.id("promtButton")).click();
		
		
		// Verify that "You entered PrimeTech" text displays.
			
}
	} 
}
//}