package WindowHandles;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class IframeDemo {
	
	public static void main (String[] args) throws InterruptedException {	
			iframeDemo();
			
	}
	public static void iframeDemo() {
		
		
		
		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			
			// go to https://demoqa.com/nestedframes
			driver.get("https://demoqa.com/nestedframes");
			
			// get the main content text
			String mainframeText = driver.findElement(By.xpath("//*[contains(text(), 'Sample Nested Iframe page')]")).getText();
			System.out.println(mainframeText);
			
			// switch to parent frame and get the text 
			driver.switchTo().frame("frame1");
			String frameText = driver.findElement(By.xpath("//*[contains(text(), 'Parent frame')]")).getText();
				System.out.println(frameText);
			
		
			// switch to child frame and get the text 
			
				driver.switchTo().frame(0);
				String childframeText = driver.findElement(By.xpath("//*[contains(text(), 'Child Iframe')]")).getText();
				System.out.println(childframeText);
			
			// switch back to parent frame and get the text (print)
			driver.switchTo().parentFrame(); // driver goes back to parent frame.
			 String parentframeText = driver.findElement(By.xpath("//*[contains(text(), 'Parent frame')]")).getText();
			 System.out.println("The parentframe text is:  " +parentframeText);
			 
			// switch to defalt content and get the text
			driver.switchTo().defaultContent(); // driver goes back to default frame
			String defaultcontentText = driver.findElement(By.xpath("//*[contains(text(), 'Sample Nested Iframe page')]")).getText();
			System.out.println("The Default Content text is: " +defaultcontentText);
	
	}

		
		


}

