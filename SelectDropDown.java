
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = ("https://www.orangehrm.com/en/book-a-free-demo/");
		
	    WebDriver driver = new ChromeDriver (); 
	    driver.get(url);
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	   
	 WebElement country = driver.findElement(By.id("Form_getForm_Country")); //dropdown on page
	 Select dropdownCountry = new Select (country);  //Select class is created in selenuim
	 
	 dropdownCountry.selectByValue("United States");
	 
	 //dropdown can be run by three methods
	 
	// selectByValue //selectByIndex //selectByVisibleText
	 
	 
	 
	    
	}

}
