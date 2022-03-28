import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Activity_8 {
	
	@Test
	public void activity_8() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/crm");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).click();
		
		WebElement sales = driver.findElement(By.xpath("//*[text()='Sales']"));
		Actions a = new Actions(driver);
		
		a.moveToElement(sales).build().perform();		
		driver.findElement(By.id("moduleTab_9_Accounts")).click();
		Thread.sleep(2000);
		//First 5 Odd number rows
		//(//tr[@class='oddListRowS1']/td[3])[1]
		for(int i=1;i<6;i++) {
			String name = driver.findElement(By.xpath("(//tr[@class='oddListRowS1']/td[3])["+i+"]")).getText();
			System.out.println("The name of "+i+" odd number is:"+name);
			
			
			
		}
		driver.close();
	}

}
