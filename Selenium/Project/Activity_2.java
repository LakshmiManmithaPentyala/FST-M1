import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity_2 {
	
		/* Open a browser.
b. Navigate to ‘http://alchemy.hguy.co/crm’.
Get the url of the header image.
d. Print the url to the console.
e. Close the browser.
		 */
	//Goal: Print the url of the header image to the console
		 
		 
		@Test
		public void activity2() {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/crm");
		
		WebElement headerImage = driver.findElement(By.xpath("//*[@alt='SuiteCRM']"));
		String url = headerImage.getAttribute("src");
		System.out.println("The url of the console is: "+url);
		driver.close();
		
		
	}

}
