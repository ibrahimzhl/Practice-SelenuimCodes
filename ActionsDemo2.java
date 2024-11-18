import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionsDemo2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "https://www.orangehrm.com/en/pricing"; 
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		Actions builder = new Actions(driver);
		
		
		WebElement fullname = driver.findElement(By.cssSelector("Form_getForm_FullName_Holder"));
		builder.contextClick(fullname).build().perform();
		builder.doubleClick(fullname).build().perform();
		builder.clickAndHold(fullname).build().perform();
		
		WebElement email = driver.findElement(By.cssSelector("Form_getForm_Email_Holder"));
		builder.contextClick(email).build().perform();
		builder.doubleClick(email).build().perform();
		builder.clickAndHold(email).build().perform();
		
		WebElement companyname = driver.findElement(By.cssSelector("Form_getForm_CompanyName_Holder"));
		builder.contextClick(companyname).build().perform();
		builder.doubleClick(companyname).build().perform();
		builder.clickAndHold(companyname).build().perform();

		
		//write a code for Email - Company Name and PhoneNumber 
		
		
	}

}