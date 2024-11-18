package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class LoginPageTest {
	
	WebDriver driver;
	String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	By username = By.xpath("//input[@name='username']");
	By password = By.xpath("//input[@name='password']");
	By loginButton = By.xpath("//button[@type='submit']");
  @Test
  public void launchUrl() {
	  
	  driver.get(url);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  System.out.println("Launch Url"+url);
	  
  }
  @Test
  public void login() {
	  
	  driver.findElement(username).sendKeys("admin");
	  driver.findElement(password).sendKeys("admin123");
	  driver.findElement(loginButton).click();
	  System.out.println("Login is completed");
  }
  
  @BeforeClass
  public void beforeClass() {
	  driver = new ChromeDriver();
  }

  @AfterClass
  public void afterClass() {
	  //driver.close();
  }

}
