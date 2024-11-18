
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectNumberOfPeople {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = ("https://www.orangehrm.com/en/contact-sales");
		
	    WebDriver driver = new ChromeDriver (); 
	    driver.get(url);
	   
	 WebElement noEmployee=   driver.findElement(By.xpath("//*[@id=\"Form_getForm_NoOfEmployees\"]"));
	 
	 Select dropdownNoOfEmployee = new Select(noEmployee);
	dropdownNoOfEmployee.selectByIndex(10);
	 
	 //dropdown can be run by three methods
	 
	// selectByValue //selectByIndex //selectByVisibleText
	 
	 
	 
	    ////*[@id="Form_getForm_NoOfEmployees"]
	}

}