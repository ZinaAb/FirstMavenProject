package WindowHandles;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WindowHandlesDemo {
	
	
	public static void main (String[] args) throws InterruptedException {	
		demoQAWindowHandlesDemo();
		
	}
	
	public static void demoQAWindowHandlesDemo() throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		//Test case 2 
//go to https://demoqa.com/browser-windows
		driver.get("https://demoqa.com/browser-windows");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tabButton")));
//1. Get the main window ID and store it in a String called mainWindowId, 
		String mainWindowID = driver.getWindowHandle();
		System.out.println("Main window ID is: " + mainWindowID);
//2. Click on the 'New Tab' button
		driver.findElement(By.id("tabButton")).click();
		Thread.sleep(5000);
			
//3. Get window IDs and store it into a Set
		Set<String> windowIDs = driver.getWindowHandles();	
		
//4. Get the first window ID from the Set and Verify it matches with the main window id in step 1. 
		//Then get the second window id and store it in variable called secondWindowId.
		for (String windowIdSingle : windowIDs) {
			System.out.println(windowIdSingle);
			if (windowIdSingle.equals(mainWindowID)) {
			System.out.println("Main window ID second check is : " + windowIdSingle);
		}
		}
//5. Switch to the second window
			for (String windowIdSingle2 : windowIDs) {
				System.out.println(windowIdSingle2);
				if (!windowIdSingle2.equals(mainWindowID)) {
					driver.switchTo().window(windowIdSingle2);
			}
			}	
// 6. Verify that there is a text called 'This is a sample page'
		if	(driver.findElement(By.id("sampleHeading")).getText().equals("This is a sample page")) {
			System.out.println("Second window text matches. Pass");
		}else {
			System.out.println("Second window text DOES NOT match. Fail");
		}
//7. Close the window,Switch back to the main window, Verify you are on the main window. 
//(verify with page title or page url)
		
		driver.close();
		
	
		
}
	}	
	
	
