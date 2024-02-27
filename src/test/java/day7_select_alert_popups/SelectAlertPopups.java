package day7_select_alert_popups;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectAlertPopups {
	
	private static final FluentWait<WebDriver> letssWait = null;

	public static void main(String[] args) throws InterruptedException{	
		selecrDemo();
		
}
	
	public static <webElement> void selecrDemo() throws InterruptedException{	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoqa.com/select-menu");
		//select 
		WebElement colors = driver.findElement(By.id("oldSelectMenu"));
		
		Select letsSelect = new Select(colors);
		Thread.sleep(500);
		
		   //What is the default selected item?
	    String firstSelectedColor = letsSelect.getFirstSelectedOption().getText();
	    System.out.println("default selected color is:" + firstSelectedColor);
	    
	    
	       //get all the selected options;
	    List<WebElement> allColors = letsSelect.getOptions();
	    System.out.println("Numbers of available colors are: " + allColors.size());
	    
	    for (WebElement color : allColors) {
	    	System.out.println("color is: " + color.getText());
	    }
		
	    //get all selected options:
	    List<WebElement> allSelectedOption = letsSelect.getAllSelectedOptions();
	    System.out.println("All selected option size is: " + allSelectedOption.size());
	    
	    
	    
		letsSelect.selectByVisibleText("Black");
		Thread.sleep(2000);
	
		letsSelect.selectByIndex(4);
		Thread.sleep(2000);
		
	    letsSelect.selectByValue("10");
	    
	 
		//choose anything form the drop down
	    driver.get("https://semantic-ui.com/modules/dropdown.html");
	    
	    driver.findElement(By.xpath("(//div[@class='ui fluid search selection dropdown'])[1]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//div[text()='Algeria'])[1]")).click();
	    
	    
	    //day 2
	    //select green, blue and black from multi select dropdown 
	    driver.get("https://demoqa.com/select-menu");
	    
	    driver.findElement(By.xpath("//div[text((='Select...']")).click();
	    Thread.sleep(2000);
	    
	     //find the green and click
	    driver.findElement(By.xpath("//div[text((='Green']")).click();
	    
	     //find the blue and click
	    driver.findElement(By.xpath("//div[text((='Blue']")).click();
	    
	    //find the black and click
	    driver.findElement(By.xpath("//div[text((='Black']")).click();
	    Thread.sleep(1000);
	    
	    //deselect the black
	    driver.findElement(By.xpath("(//div[@class='css-xb97g8'])[3]")).click();
	    
	    
	    
	    //select all option one by one
	    WebElement multiCarSelect = driver.findElement(By.id("cars"));
	    Select select = new Select(multiCarSelect);
		select.selectByVisibleText("Volvo");
		select.selectByVisibleText("Saab");
		select.selectByVisibleText("Opel");
		select.selectByVisibleText("Audi");

		// deselect Opel from it
		select.deselectByVisibleText("Saab");
		Thread.sleep(3000);
		
		select.deselectAll();
		
		//to create class
		//public static void (put anything here) (){
	
	
		//go to ebay.com
		driver.get("https://ebay.com");
		
		//click on motors
		driver.findElement(By.linkText("motors")).click();
		
		//wait until the add vehicle text is visible
		
		// create an object of webDriverWait
		WebDriverWait letsWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		//( make sure you are in this page)
		letssWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Add a vehicle']")));
		
		//WebElement addVehicleLink = driver.findElement(By.xpath("//div[text()='Add a vehicle']"));
		//letsWiat.until(ExpectedConditions.visibilityOf(addVehicleLink));
		
		
		//once it's, then print its visible
		System.out.println("Element is visible");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	    
	}
}