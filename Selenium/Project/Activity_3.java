import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity_3 {
	
	
		/*
		 * Open a browser.
b. Navigate to ‘http://alchemy.hguy.co/crm’.
Get the first copyright text in the footer.
d. Print the text to the console.
e. Close the browser.
		 * 
		 * 
		 * 
		 */
	
	//Print the first copyright text in the footer to the console
	@Test
		public void activity3() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/crm");
		Thread.sleep(2000);
		WebElement copyRight=driver.findElement(By.id("admin_options"));
		//WebElement copyRight = driver.findElement(By.xpath("//a[text(),'© Supercharged by SuiteCRM'])"));
		System.out.println("The first CopyRight text in the footer is:"+copyRight.getText());
		driver.close();
		
	}

}
