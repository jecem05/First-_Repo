package cargurugitest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;


public class RegisterNewUser {
	
	public WebDriver driver;
	public int random;
	
	
	@Before
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://www.carguruji.com/shop");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void TestRegisterNewUser() throws InterruptedException {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.id("tdb4")).click();
		driver.findElement(By.name("gender")).click();
		driver.findElement(By.name("firstname")).sendKeys("Jozzi");
		driver.findElement(By.name("lastname")).sendKeys("Ope");
		driver.findElement(By.id("dob")).sendKeys("02/04/1980");
		
		//*********Generating Random email address********
		random = 100 +(int)(Math.random()* ((1000 - 1) + 1));
		
		System.out.println(random);
		driver.findElement(By.name("email_address")).sendKeys("Jozzi" + random + "@aol.com");
		Thread.sleep(1000);
		
		driver.findElement(By.name("street_address")).sendKeys("33 champness rd");
		driver.findElement(By.name("postcode")).sendKeys("ig11 9pd");
		driver.findElement(By.name("city")).sendKeys("london");
		driver.findElement(By.name("state")).sendKeys("london");
		driver.findElement(By.name("country")).sendKeys("united kingdom");
		driver.findElement(By.name("telephone")).sendKeys("07495930490");
		driver.findElement(By.name("password")).sendKeys("Alliswell109");
		Thread.sleep(5000);
		driver.findElement(By.name("confirmation")).sendKeys("Alliswell109");
		driver.findElement(By.id("tdb4")).click();
		Thread.sleep(2000);
		
        String ExpectedMessage = "Your Account Has Been Created!";
		
		String ActualMessage = driver.findElement(By.xpath(".//*[@id='bodyContent']/h1")).getText();
		
		
		Assert.assertEquals(ExpectedMessage, ActualMessage);
		
		//String ExpectedMessage = driver.findElement(By.xpath(".//*[@id='bodyContent']/h1")).getText();
		//System.out.println(ExpectedMessage);
		
		
		

		
		}
	
	   
	

		
	
	
		
	
	

}
