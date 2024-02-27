package hoverOver_DragAndDrop;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mifmif.common.regex.util.Iterator;

public class DragAndDrop {
	public static void main (String[] args) throws InterruptedException {	
		dragAndDropDemo();
	
	}
	
	public static void dragAndDropDemo() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		// go to https://demoqa.com/droppable
		driver.get("https://demoqa.com/droppable");
		
		// drag the drag me box into drop here box
		
		Actions act = new Actions(driver); 
		
		WebElement dragMeBox = driver.findElement(By.id("draggable"));
		WebElement dropHereBox = driver.findElement(By.id("droppable"));
		
		act.dragAndDrop(dragMeBox, dropHereBox).build().perform();
		
		
	}

}
