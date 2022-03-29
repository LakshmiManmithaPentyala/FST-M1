package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		
	}
	
	@Test
	public void verifyTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println("The title of the page is: "+title);
		Assert.assertEquals(title, "Training Support");
		driver.findElement(By.xpath("//a[text()='About Us']")).click();
		String aboutUsTitle = driver.getTitle();
		System.out.println(aboutUsTitle);
		Assert.assertEquals(aboutUsTitle, "About Training Support");
		
	}
	
	@AfterMethod()
	public void tearDown(){
		driver.close();
		
	}

}
