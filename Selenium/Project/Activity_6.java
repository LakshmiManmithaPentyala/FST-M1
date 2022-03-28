import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity_6 {
	
	//Goal: Make sure that the “Activities” menu item exists and is clickable
	
	@Test
	public void activity6() {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/crm");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).click();
		WebElement activities = driver.findElement(By.id("grouptab_3"));
		if(activities.isDisplayed()==true) {
			System.out.println("Activities tab exists");
			
		}
		driver.close();
		
	}

}
