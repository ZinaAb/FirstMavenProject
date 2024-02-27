package Crater;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.mifmif.common.regex.util.Iterator;

public class LogIn {
	
	
		public static void main (String[] args) throws InterruptedException {	
			login();
		}
	
	public static void login() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		// go to https://carter.com
		driver.get("http://crater.primetech-apps.com");
		//fill the email part
		WebElement EmailID = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[1]/div/div/input"));
		EmailID.sendKeys("dummy@primetechschool.com");
		//fill password
		WebElement PassWord = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[2]/div/div/input"));
		PassWord.sendKeys("primetech@school");
		//click
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/button")).click();
		Thread.sleep(3000);
		//click on item
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/a[3]")).click();
		Thread.sleep(5000);
		
		//adding item
		driver.findElement(By.xpath("/html/body/div/main/div/div/div[1]/div[2]/div/button[2]")).click();
		Thread.sleep(5000);
		// add name on the name field
		WebElement name = driver.findElement(By.xpath("/html/body/div/main/div/div/form/div/div/div/div[1]/div/div/input"));
		name.sendKeys("Zina");
		
		//add price
		WebElement price = driver.findElement(By.xpath("//*[@id=\"0\"]"));
		price.sendKeys("59.00");
		
		//dropdown
		
		// description
		WebElement description = driver.findElement(By.xpath("/html/body/div/main/div/div/form/div/div/div/div[4]/div/textarea"));
		description.sendKeys("Please add gift wrap ");
		
		//save Item
		driver.findElement(By.xpath("/html/body/div/main/div/div/form/div/div/div/div[5]/button")).click();
		
		
		//act.sendkeys();  
	}

}