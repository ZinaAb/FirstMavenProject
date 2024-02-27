package WindowHandles;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mifmif.common.regex.util.Iterator;


public class demo_guru99 {

	public static void main (String[] args) throws InterruptedException {	
		demo_guru_99_hw();
}


public static void demo_guru_99_hw() throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	
			//go to http://demo.guru99.com/popup.php
	
			driver.get("http://demo.guru99.com/popup.php");
			
	    // Get title and store it in a variable.
			
			String PageTitle = driver.getTitle();
			System.out.println("Page title is: " + PageTitle);
			
	    // Click on Click Here button and switch over to next window, provide an email click Submit.
			driver.findElement(By.xpath("//*[contains(text(), 'Click Here')]")).click();
			///////We have to switch to the new window here
			String mainWindowID = driver.getWindowHandle();
			Set<String> windowIDs = driver.getWindowHandles();
			
			for (String windowIdSingle : windowIDs) {
				//System.out.println(windowIdSingle);
				if (windowIdSingle.equals(mainWindowID)) {		
			}
			}
			for (String windowIdSingle2 : windowIDs) {
				if (!windowIdSingle2.equals(mainWindowID)) {
					driver.switchTo().window(windowIdSingle2);
			}
			}	
			//Once we changed to the new tab, we can enter the emailId and click submit
			WebElement EmailID = driver.findElement(By.name("emailid"));
			EmailID.sendKeys("1234@yahoo.com");
			driver.findElement(By.name("btnLogin")).click();	
	    // Get text of the user ID and password and store them in variables, print them out. 
			
			String UserID = driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[2]")).getText();
			System.out.println("The UserID is: " + UserID);
			String Password = driver.findElement(By.xpath("/html/body/table/tbody/tr[5]/td[2]")).getText();
			System.out.println("The Password is: " + Password);
	    // Then verify the text "This access is valid only for 20 days."
			if	(driver.findElement(By.xpath("/html/body/table/tbody/tr[6]/td/h3")).getText().equals("This access is valid only for 20 days.")) {
				System.out.println("Text matches. Pass");
			}else {
				System.out.println("Text DOES NOT match. Fail");
			}
	    // Close the window.
			driver.close();	
	    // Go back to main window, and get title then verify it equals to your stored title.
			// Here we have to switch the driver back to the main window
				driver.switchTo().window(mainWindowID);	
				
			String PageTitle2 = driver.getTitle();
			System.out.println("Second round check - Page title is: " + PageTitle2);
			if (PageTitle.equals(PageTitle2)) {
				System.out.println("The Title is equal to the strored Title");
		}
			else {
				System.out.println("The Title is NOT equal to the strored Title");
			}
	    // Quit driver. 
				
				driver.quit();
	
}

}