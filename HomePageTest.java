package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class HomePageTest {
	
	WebDriver driver;
	String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	By username = By.xpath("//input[@name='username']");
	By password = By.xpath("//input[@name='password']");
	By loginButton = By.xpath("//button[@type='submit']");
	
	@Test (priority =1)
  public void login() {
		System.out.println("Login Method");
  }
	@Test (priority =2)
  public void addToCart() {
		System.out.println("Add to Cart");
  }
	@Test (priority =3)
  public void payment() {
		System.out.println("Payment Method");
  }
	@Test (priority =4)
  public void logout() {
		System.out.println("Logout Method");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");
  }

}
