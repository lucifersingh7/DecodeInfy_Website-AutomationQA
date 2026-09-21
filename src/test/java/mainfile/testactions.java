package mainfile;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.homepage;

public class testactions {

	public static WebDriver driver;
	
	@Test(priority=1)
	public static void homePage() throws Exception {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://decodeinfy.in/");   //redirecting to URL
		
		String parentWindow = driver.getWindowHandle(); // getting the unique Id of Parent window
		
	    pages.homepage.instagramBtn(driver);
	    JavascriptExecutor js = (JavascriptExecutor) driver;  // scrolling down to an WebElement using JS
	    js.executeScript("arguments[0].scrollIntoView();", pages.homepage.instagramBtn(driver));
	    Thread.sleep(3000);
	    pages.homepage.instagramBtn(driver).click();
	    Thread.sleep(3000);
	    
	    
	    Set<String> Allvalues = driver.getWindowHandles();
	    for(String windowId: Allvalues ) {
	    	System.out.println("Window title is: "+windowId);
	    	Thread.sleep(2000);
	    }
	    
		driver.switchTo().window(parentWindow); // switching back to Parent Window
	    
	    Thread.sleep(2000);
		driver.quit();
		
	 }
	
}
