package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage {

	public static WebElement element = null;
	
	public static WebElement startConversationBtn(WebDriver driver) {
		element = driver.findElement(By.xpath("(//a[normalize-space()='Start a Conversation'])[1]"));
		return element;
	}
	public static WebElement instagramBtn(WebDriver driver) {
		element = driver.findElement(By.xpath("(//i[@class='fab fa-instagram'])[1]"));
		return element;
	}
	
}
