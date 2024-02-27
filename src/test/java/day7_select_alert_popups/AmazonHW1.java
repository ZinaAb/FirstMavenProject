package day7_select_alert_popups;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonHW1 {
	
	public static void main(String[] args) throws InterruptedException{	
		selecrDemo();
		
}
	
	public static void selecrDemo() throws InterruptedException{	
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoqa.com/select-menu");
		
    WebElement allColor = driver.findElement(By.id("oldSelectMenu"));
    
    Select letsSelect = new Select(allColor);
	Thread.sleep(500);
	
    
    List<WebElement> allColors = letsSelect.getOptions();
    System.out.println("Numbers of available colors are: " + allColors.size());
    
    for (WebElement color : allColors) {
    	System.out.println("color is: " + color.getText());
    	
    }
    	Thread.sleep(5000);
    	
    	//int size = allColors.size();
   if 
    	(allColors.size()== 11) {
    	System.out.println("The correct number of colors is listed");
    }
    else {	
    		
    		System.out.println("The correct number of colors is not listed");	
    		
    		driver.quit();
}

}
}
