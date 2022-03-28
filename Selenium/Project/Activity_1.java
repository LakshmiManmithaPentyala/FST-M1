import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity_1 {
	
		
		
		/*a. Open a browser.
		b. Navigate to ‘http://alchemy.hguy.co/crm’.
		c. Get the title of the website.
		d. Make sure it matches “SuiteCRM” exactly.
		e. If it matches, close the browser.*/
        @Test
		public void activity1() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/crm");
		String title = driver.getTitle();
		System.out.println("The title of the page is: "+title);
		Assert.assertEquals(title, "SuiteCRM");
		driver.close();
		
		
		
	}

}
