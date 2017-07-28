package cargurugitest;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPassword {
	
public WebDriver driver;

@Before
public void setUp(){
	
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.navigate().to("http://www.carguruji.com/shop");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
}


@Test
public void loginUser() throws InterruptedException{
	driver.findElement(By.id("tdb3")).click();
	driver.findElement(By.linkText("Password forgotten? Click here.")).click();
	driver.findElement(By.name("email_address")).sendKeys("Jozzi12@aol.com");
	driver.findElement(By.id("tdb4")).click();
	Thread.sleep(5000);
	
	String ExpectedMessage = driver.findElement(By.xpath(".//*[@id='bodyContent']/h1")).getText();
	System.out.println(ExpectedMessage);
	
}

@After
public void TearDown(){
	//driver.quit();
}
}
