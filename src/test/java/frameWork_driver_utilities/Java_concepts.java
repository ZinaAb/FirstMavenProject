package frameWork_driver_utilities;

import org.openqa.selenium.WebElement;

public class Java_concepts {

	public static void main (String[] args) {	
	System.out.println(concatenateStrings("Hello", "World"));
	}
	
	//Create a method that accepts a webelement and returns the text of the webelement as a string
	public static String textOfElement(WebElement element) {
		return element.getText();
	}
	
	//Create a method that accepts a webElement and input string, that sendkeys the string to the webelement
	public static void typeTheString(WebElement element, String input) {
		element.sendKeys(input);
	}
	
	//Create a function that accepts a webElement and click on the webElement
	
	public static void ClickOnIt(WebElement element) {
	element.click();
	}
	
	//create a method that accepts a webElement and click on the webElement
	public static void printString(String x) {
		System.out.println(x);
	}
	
	private WebElement btnLogin;
	//Create a function that accepts two strings & returns a concatenate string of those two.
public static String concatenateStrings(String x, String y) {
	
	return x.concat(y);
}
	
}
