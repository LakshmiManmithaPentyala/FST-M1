package activities;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
		
	}
	
	@Test
	public void testCase1() {
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println("The title of the page is: "+title);
		Assert.assertEquals(title, "Target Practice");
		}
	@Test
	public void testCase2() {
		WebElement blackButton=driver.findElement(By.xpath("//button[text()='Black']"));
		Assert.assertTrue(blackButton.isDisplayed());
		Assert.assertEquals(blackButton.getText(), "black");
		
		
	}
	
	@Test(enabled=false)
	public void testCase3() {
		String subHeading = driver.findElement(By.className("sub")).getText();
        Assert.assertTrue(subHeading.contains("Practice"));
    }
	
	@Test
    public void testCase4() {
        //This test will be skipped and will be be shown as skipped
        throw new SkipException("Skipping test case");      
    }
	
	@AfterMethod()
	public void tearDown(){
		driver.close();
		
	}

}
