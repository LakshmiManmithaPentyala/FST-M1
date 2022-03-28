import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Activity_7 {
	
	//Reading a popup that contains additional information about the account/lead.
	
	@Test
	public void activity7() throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/crm");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).click();
		WebElement sales = driver.findElement(By.xpath("//*[text()='Sales']"));
		Actions a = new Actions(driver);
		
		a.moveToElement(sales).build().perform();		//Thread.sleep(2000);
		driver.findElement(By.id("moduleTab_9_Leads")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@title='Additional Details']")).click();
		Thread.sleep(2000);
		String phoneno=driver.findElement(By.xpath("//span[@class = 'phone']")).getText();
		System.out.println("The phone number is:"+phoneno);
		//span[@class='phone']
		
		
		/*List<WebElement> additionalDetails = driver.findElements(By.xpath("//span[@title='Additional Details']"));
		for(WebElement ad: additionalDetails) {
			ad.click();
			System.out.println("heeee");
			driver.findElement(By.xpath("//button[@title='Close']")).click();
			////*[@class='open ui-dialog-content ui-widget-content']//span
			//System.out.println(driver.findElement(By.xpath("//span[@class = 'phone']")).);
			if(driver.findElement(By.xpath("//span[@class = 'phone']"))) {
				System.out.println("hello3");
			
				System.out.println("The phone number is:"+driver.findElement(By.xpath("//span[@class = 'phone']")).getText());
				break;
			}
			else {
				System.out.println("hello1");
				driver.findElement(By.xpath("(//button[@title='Close'])[6]")).click();
				System.out.println("hello2");
				
			}*/
			
		//}*/
		driver.close();
	}

}
