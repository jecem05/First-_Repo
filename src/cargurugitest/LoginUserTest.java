package cargurugitest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class LoginUserTest {

	
	public WebDriver driver;
	
	@Before
	public void setUp(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://www.carguruji.com/shop");
		driver.manage().window().maximize();
		
		
	
	}
	
	@Test
	public void LoginUser(){
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.name("email_address")).sendKeys("Jozzi@aol.com");
		driver.findElement(By.name("password")).sendKeys("Alliswell109");
		driver.findElement(By.id("tdb5")).click();
		
	}
	
	@After
	public void Teardown(){
		driver.close();
	}
}
